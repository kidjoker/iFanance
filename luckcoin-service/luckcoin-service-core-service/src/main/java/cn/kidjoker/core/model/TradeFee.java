/** work for life!
 * 
 */
package cn.kidjoker.core.model;

import java.math.BigDecimal;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class TradeFee extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = -307528453340273536L;

	private String tradeFeeSeq;
	
	private String tradeType;
	
	private String currency;
	
	private BigDecimal startAmount;
	
	private BigDecimal endAmount;
	
	private BigDecimal fixedAmount;
	
	private BigDecimal feeRate;
	
	private BigDecimal singleMinFee;
	
	private BigDecimal singleMaxFee;

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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(BigDecimal startAmount) {
		this.startAmount = startAmount;
	}

	public BigDecimal getEndAmount() {
		return endAmount;
	}

	public void setEndAmount(BigDecimal endAmount) {
		this.endAmount = endAmount;
	}

	public BigDecimal getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(BigDecimal fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public BigDecimal getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
	}

	public BigDecimal getSingleMinFee() {
		return singleMinFee;
	}

	public void setSingleMinFee(BigDecimal singleMinFee) {
		this.singleMinFee = singleMinFee;
	}

	public BigDecimal getSingleMaxFee() {
		return singleMaxFee;
	}

	public void setSingleMaxFee(BigDecimal singleMaxFee) {
		this.singleMaxFee = singleMaxFee;
	}
	
}
