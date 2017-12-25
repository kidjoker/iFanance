/** work for life!
 * 
 */
package cn.kidjoker.core.model;

import java.util.Date;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class OrderData extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = 2742583271212112916L;

	private String orderNo;
	
	private String adId;
	
	private String userNo;
	
	private String tradeFeeSeq;
	
	private String tradeType;
	
	private String tradeCurrency;
	
	private String initiatorUserNo;
	
	private String initiatorInfo;
	
	private String receiverUserNo;
	
	private String receiverInfo;
	
	private String tradeAmount;
	
	private String payMethod;
	
	private String tradeStatus;
	
	private Date tradeTime;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getTradeFeeSeq() {
		return tradeFeeSeq;
	}

	public void setTradeFeeSeq(String tradeFeeSeq) {
		this.tradeFeeSeq = tradeFeeSeq;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeCurrency() {
		return tradeCurrency;
	}

	public void setTradeCurrency(String tradeCurrency) {
		this.tradeCurrency = tradeCurrency;
	}

	public String getInitiatorUserNo() {
		return initiatorUserNo;
	}

	public void setInitiatorUserNo(String initiatorUserNo) {
		this.initiatorUserNo = initiatorUserNo;
	}

	public String getInitiatorInfo() {
		return initiatorInfo;
	}

	public void setInitiatorInfo(String initiatorInfo) {
		this.initiatorInfo = initiatorInfo;
	}

	public String getReceiverUserNo() {
		return receiverUserNo;
	}

	public void setReceiverUserNo(String receiverUserNo) {
		this.receiverUserNo = receiverUserNo;
	}

	public String getReceiverInfo() {
		return receiverInfo;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public String getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
