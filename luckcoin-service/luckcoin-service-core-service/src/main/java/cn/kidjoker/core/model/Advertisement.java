/** work for life!
 * 
 */
package cn.kidjoker.core.model;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class Advertisement extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = -8491298025656836606L;

	private String adId;
	
	private String adName;
	
	private String sellerId;
	
	private String coinTypeId;
	
	private String adURL;
	
	private int adClickNum;
	
	private int adSort;
	
	private String adStatus;

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCoinTypeId() {
		return coinTypeId;
	}

	public void setCoinTypeId(String coinTypeId) {
		this.coinTypeId = coinTypeId;
	}

	public String getAdURL() {
		return adURL;
	}

	public void setAdURL(String adURL) {
		this.adURL = adURL;
	}

	public int getAdClickNum() {
		return adClickNum;
	}

	public void setAdClickNum(int adClickNum) {
		this.adClickNum = adClickNum;
	}

	public int getAdSort() {
		return adSort;
	}

	public void setAdSort(int adSort) {
		this.adSort = adSort;
	}

	public String getAdStatus() {
		return adStatus;
	}

	public void setAdStatus(String adStatus) {
		this.adStatus = adStatus;
	}
	
}
