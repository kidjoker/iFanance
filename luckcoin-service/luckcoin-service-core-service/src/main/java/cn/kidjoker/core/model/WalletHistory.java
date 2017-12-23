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
public class WalletHistory extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = -9108046428527654665L;

	private String walletHistorySeq;
	
	private String acctNo;
	
	private String tradeNo;
	
	private String tradeType;
	
	private BigDecimal acctBalance;
	
	private String fundFlow;
	
	private BigDecimal tradeAmount;
	
	private String tradeAbstract;

	public String getWalletHistorySeq() {
		return walletHistorySeq;
	}

	public void setWalletHistorySeq(String walletHistorySeq) {
		this.walletHistorySeq = walletHistorySeq;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public BigDecimal getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(BigDecimal acctBalance) {
		this.acctBalance = acctBalance;
	}

	public String getFundFlow() {
		return fundFlow;
	}

	public void setFundFlow(String fundFlow) {
		this.fundFlow = fundFlow;
	}

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeAbstract() {
		return tradeAbstract;
	}

	public void setTradeAbstract(String tradeAbstract) {
		this.tradeAbstract = tradeAbstract;
	}
	
}
