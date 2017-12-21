package cn.kidjoker.common.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * https请求验证工具?
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:27:10
 * @version 1.0.0
 */
public class HttpsTrustManager implements X509TrustManager {
	
	/**
	 * 检查客户端证书
	 */
	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {

	}

	/**
	 * 检查服务器端证书
	 */
	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1)
			throws CertificateException {

	}

	/**
	 * 返回受信任的X509证书数组
	 */
	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
}
