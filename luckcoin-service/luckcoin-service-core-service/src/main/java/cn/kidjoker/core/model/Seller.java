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
public class Seller extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = 2865791571896810539L;

	private String sellerId;
	
	private String sellerUsername;
	
	private String tradeCount;
	
	private String favorableRate;
	
	private String supplyPrice;
	
	private String payMethod;
	
	private String priceMax;
	
	private String priceMin;

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerUsername() {
		return sellerUsername;
	}

	public void setSellerUsername(String sellerUsername) {
		this.sellerUsername = sellerUsername;
	}

	public String getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(String tradeCount) {
		this.tradeCount = tradeCount;
	}

	public String getFavorableRate() {
		return favorableRate;
	}

	public void setFavorableRate(String favorableRate) {
		this.favorableRate = favorableRate;
	}

	public String getSupplyPrice() {
		return supplyPrice;
	}

	public void setSupplyPrice(String supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(String priceMax) {
		this.priceMax = priceMax;
	}

	public String getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(String priceMin) {
		this.priceMin = priceMin;
	}
	
}
