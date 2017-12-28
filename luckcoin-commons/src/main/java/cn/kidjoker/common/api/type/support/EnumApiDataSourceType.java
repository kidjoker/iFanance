package cn.kidjoker.common.api.type.support;

import java.security.KeyStore.PrivateKeyEntry;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月28日 - 下午11:07:09
 * @version 1.0.0
 */
public enum EnumApiDataSourceType {
	
	OKCOIN("0"),BITFINEX("1"),COINMARKETCAP("2"),KRAKEN("3"),POLLONIEX("4"),COINCHECK("5");
	
	private String serviceName;
	
	private EnumApiDataSourceType(String serviceName) {
		
		this.serviceName = serviceName;
	}
	
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public EnumApiDataSourceType convertValue(String serviceName) {
		for(EnumApiDataSourceType e : this.values()) {
			if(e.getServiceName().equals(serviceName)) {
				return e;
			}
		}
		return null;
	}
	
}
