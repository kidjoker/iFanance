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
public class Wallet extends BaseModelAdapter<String> {
		
	private static final long serialVersionUID = -16024609048844835L;

	private String acctNo;
	
	private String walletHistorySeq;
	
	private String coinTypeId;
	
	private String userNo;
	
	private String walletType;
	
	private String currency;
	
	private BigDecimal totalAmount;
	
	private BigDecimal frozenAmount;
	
	private String accountStatus;

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getWalletHistorySeq() {
		return walletHistorySeq;
	}

	public void setWalletHistorySeq(String walletHistorySeq) {
		this.walletHistorySeq = walletHistorySeq;
	}

	public String getCoinTypeId() {
		return coinTypeId;
	}

	public void setCoinTypeId(String coinTypeId) {
		this.coinTypeId = coinTypeId;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getWalletType() {
		return walletType;
	}

	public void setWalletType(String walletType) {
		this.walletType = walletType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getFrozenAmount() {
		return frozenAmount;
	}

	public void setFrozenAmount(BigDecimal frozenAmount) {
		this.frozenAmount = frozenAmount;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
}
