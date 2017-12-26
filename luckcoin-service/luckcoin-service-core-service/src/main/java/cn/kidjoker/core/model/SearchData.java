/*
 * ================================================================
 * Copyright 2008-2017 Everelegance.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Everelegance Corp. Ltd, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Everelegance.
 * 
 * OPay项目组
 *
 * ================================================================
 *  创建人: jinzhijie
 *	创建时间: 2017年12月26日 上午11:36:23
 */
package cn.kidjoker.core.model;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月26日 上午11:36:23
 */
public class SearchData extends BaseModelAdapter<String> {
	
	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * 
	 * Data members.
	 * 
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	*/
	
	private static final long serialVersionUID = -2597972004887977882L;
	
	private String SearchSeq;
	
	private String coinType;
	
	private String high;
	
	private String vol;
	
	private String last;
	
	private String low;
	
	private String buy;
	
	private String sell;
	
	/**
	 * @return the searchSeq
	 */
	public String getSearchSeq() {
		return SearchSeq;
	}

	/**
	 * @param searchSeq the searchSeq to set
	 */
	public void setSearchSeq(String searchSeq) {
		SearchSeq = searchSeq;
	}

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getBuy() {
		return buy;
	}

	public void setBuy(String buy) {
		this.buy = buy;
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell;
	}

}
