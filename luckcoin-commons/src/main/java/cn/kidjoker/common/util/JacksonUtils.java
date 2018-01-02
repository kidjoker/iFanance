package cn.kidjoker.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.kidjoker.common.param.CommonParam;

/**
 * jackson工具类
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:00:03
 * @version 1.0.0
 */
public class JacksonUtils {
	
	private static Logger logger = LoggerFactory.getLogger(JacksonUtils.class);
	
	public static final ObjectMapper jsonMapper = new ObjectMapper();
	
	public static ObjectMapper getInstance() {
		return jsonMapper;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> toList(String jsonStr, Class<T> t) {
		JavaType javaType = getInstance().getTypeFactory().constructParametricType(List.class, t);
		
		try {
			return (List<T>)getInstance().readValue(jsonStr,javaType);
		}
		catch (Exception e) {
			logger.error("输入的json字符串[{}]格式错误", jsonStr);
			return null;
		}
	}
	
	public static <T> T getEntityFromStream(InputStream inputStream, Class<T> valueType) {
		
		try {
			return getInstance().readValue(inputStream, valueType);
		}
		catch (Exception e) {
			logger.error("输入的json字符串[{}]格式错误");
			return null;
		}
		finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				}
				catch (IOException e) {
					logger.error("输入的json流关闭失败");
				}
			}
		}
	}
	
	public static <T> T getObjectFromJsonStr(String jsonStr, Class<T> valueType) {
		getInstance().setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
		
		try {
			return getInstance().readValue(jsonStr.getBytes(CommonParam.CHARSET),valueType);
		}catch (IOException e) {
			logger.error("json串转换对象失败:[{}]",jsonStr);
			e.printStackTrace();
		}
		return null;
	}
}
