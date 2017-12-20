package cn.kidjoker.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http请求工具类
 *
 * @auther KidjokeR
 * @since 2017年12月20日 - 下午10:51:10
 * @version 1.0.0
 */
public class HttpUtils {
	
	private static Logger log = LoggerFactory.getLogger(HttpUtils.class);
	
	private final static String CHARSET = "UTF-8";
	
	/**
	 * 发送Https请求,使用jackson解析,返回的数据格式为json格式
	 * 
	 * @param requestUrl
	 * @param requestMethod
	 * @param outputStr
	 * @return
	 */
	public static ObjectNode httpsRequestRetJson(String requestUrl, String requestMethod, String outputStr) {
		
		ObjectNode jsonObject = null;
		
		try {
			
			String retStr = httpsRequest(requestUrl, requestMethod, outputStr);
			
			if(retStr != null) {
				jsonObject = JacksonUtils.getInstance().readValue(retStr, ObjectNode.class);
			}
		}
		catch(ConnectException ce) {
			log.error("连接超时: {}", ce);
		}
		catch (Exception e) {
			log.error("https请求异常: {}", e);
		}
		
		return jsonObject;
	}
	
	/**
	 * 发送http请求, 使用jackson解析,返回的数据格式为json格式
	 * 
	 * @param requestUrl
	 * @param requestMethod
	 * @param params
	 * @return
	 */
	public static ObjectNode httpRequestJson(String requestUrl, String requestMethod,Map<String, String> params) {
		
		ObjectNode jsonObject = null;
		
		try {
			
			String retStr = httpRequest(requestUrl, requestMethod, toParamString(params));
			
			if(retStr!=null){
				jsonObject = JacksonUtils.getInstance().readValue(retStr,ObjectNode.class);
			}
		} 
		catch(ConnectException ce) {
			log.error("连接超时: {}", ce);
		}
		catch (Exception e) {
			log.error("http请求异常：{}", e);
		}
		
		return jsonObject;

	}
	
	/**
	 * 
	 * @param requestUrl
	 * @param requestMethod
	 * @param outputStr
	 * @return
	 */
	public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
		
		try {
			TrustManager[] tm = {new HttpsTrustManager()};
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJssE");
			sslContext.init(null, tm, new SecureRandom());
			
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			
			//创建连接吗,配置请求属性
			URL url = new URL(requestUrl);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			con.setHostnameVerifier(new HostnameVerifier() {
				
				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			});
			con.setSSLSocketFactory(ssf);
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);  //不使用缓存
			//设置请求方式
			con.setRequestMethod(requestMethod);
			con.setConnectTimeout(5*1000);
			con.setReadTimeout(5*1000);
			
			
			//当输出流不为null时向其输出请求参数(从本机流出即为输出流)
			if(outputStr != null) {
				OutputStream outputStream = con.getOutputStream();
				outputStream.write(outputStr.getBytes(CHARSET));
				outputStream.close();
			}
			
			//从输入流读取响应数据
			InputStream inputStream = con.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, CHARSET);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer();
			String str = null;
			while((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			
			//释放资源
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			inputStream = null; //等待GC来回收内存空间
			con.disconnect();
			return buffer.toString();
		}
		catch (ConnectException ce) {
			log.error("连接超时: {}", ce);
		}
		catch (Exception e) {
			log.error("https请求异常: {}", e);
		}
		
		return null;
	
	}
	
	public static String httpRequest(String requestUrl, String requestMethod,String outputStr) {

		try {

			if ("GET".equals(requestMethod.toUpperCase()) && outputStr != null) {
				requestUrl = requestUrl + "?" + outputStr;
			}
			
			URL url = new URL(requestUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000); 
			con.setReadTimeout(5000);
			con.setDoOutput(true); // 使用 URL连接进行输出
			con.setDoInput(true); // 使用 URL连接进行输入
			con.setUseCaches(false); //不使用缓存
			// 设置请求方式（GET/POST）
			con.setRequestMethod(requestMethod);
			
			// 当outputStr不为null时向输出流写数据
			if ("POST".equals(requestMethod.toUpperCase()) && null != outputStr) {
				OutputStream outputStream = con.getOutputStream();
				outputStream.write(outputStr.getBytes(CHARSET));
				outputStream.close();
			}

			// 从输入流读取返回内容
			InputStream inputStream = con.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, CHARSET);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer();
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}

			// 释放资源
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			inputStream = null;
			con.disconnect();
			return buffer.toString();

		} 
		catch (ConnectException ce) {
			log.error("连接超时: {}", ce);
		} 
		catch (Exception e) {
			log.error("https请求异常: {}", e);
		}
		return null;
	}
	
	//默认走Get请求方式,通过Map来承接请求参数
	public static String httpsGet(String requestUrl, Map<String, String> params) {
		
		return httpsRequest(requestUrl, "GET", toParamString(params));
	}
	
	//默认走Post请求方式
	public static String httpsPost(String requestUrl, Map<String, String> params) {
		
		return httpsRequest(requestUrl, "POST", toParamString(params));
	}
	
	//默认走Get请求方式,通过Map来承接请求参数
	public static String httpGet(String requestUrl, Map<String, String> params) {

		return httpRequest(requestUrl, "GET", toParamString(params));

	}

	//默认走Post请求方式
	public static String httpPost(String requestUrl, Map<String, String> params) {

		return httpRequest(requestUrl, "POST", toParamString(params));

	}
	
	@SuppressWarnings("deprecation")
	public static String toParamString(Map<String, String> params) {
		
		String retStr = null;
		
		StringBuffer urlRequestBuffer = new StringBuffer();
		
		if(params != null && !params.isEmpty()) {
			
			for(String key : params.keySet()) {
				
				urlRequestBuffer.append("&").append(key).append("=").append(URLEncoder.encode(params.get(key)));
			}
			
			retStr = urlRequestBuffer.toString().substring(1);
		}

		return retStr;
	}
	
}
