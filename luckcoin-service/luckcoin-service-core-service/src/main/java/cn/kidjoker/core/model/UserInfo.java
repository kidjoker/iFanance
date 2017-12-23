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
public class UserInfo extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = 8183080371783000730L;

	private String userNo;
	
	private String acctNo;
	
	private String mobilePrefix;
	
	private String mobile;
	
	private String email;
	
	private String payPwd;
	
	private 	String payPwdSettingStatus;
	
	private String currentStatus;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getMobilePrefix() {
		return mobilePrefix;
	}

	public void setMobilePrefix(String mobilePrefix) {
		this.mobilePrefix = mobilePrefix;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getPayPwdSettingStatus() {
		return payPwdSettingStatus;
	}

	public void setPayPwdSettingStatus(String payPwdSettingStatus) {
		this.payPwdSettingStatus = payPwdSettingStatus;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
}
