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
 *	创建时间: 2017年12月22日 下午4:27:55
 */
package cn.kidjoker.search.data.bo;

import java.math.BigDecimal;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>
 * 币种交易数据Bo
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月22日 下午4:27:55
 */
public class SearchDataBo {
	
	private String date;
	
	private Ticker ticker;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Ticker getTicker() {
		return ticker;
	}

	public void setTicker(Ticker ticker) {
		this.ticker = ticker;
	}
	
	public static class Ticker {
		
		private String high;
		
		private String vol;
		
		private String last;
		
		private String low;
		
		private String buy;
		
		private String sell;

		/**
		 * @return the high
		 */
		public String getHigh() {
			return high;
		}

		/**
		 * @param high the high to set
		 */
		public void setHigh(String high) {
			this.high = high;
		}

		/**
		 * @return the vol
		 */
		public String getVol() {
			return vol;
		}

		/**
		 * @param vol the vol to set
		 */
		public void setVol(String vol) {
			this.vol = vol;
		}

		/**
		 * @return the last
		 */
		public String getLast() {
			return last;
		}

		/**
		 * @param last the last to set
		 */
		public void setLast(String last) {
			this.last = last;
		}

		/**
		 * @return the low
		 */
		public String getLow() {
			return low;
		}

		/**
		 * @param low the low to set
		 */
		public void setLow(String low) {
			this.low = low;
		}

		/**
		 * @return the buy
		 */
		public String getBuy() {
			return buy;
		}

		/**
		 * @param buy the buy to set
		 */
		public void setBuy(String buy) {
			this.buy = buy;
		}

		/**
		 * @return the sell
		 */
		public String getSell() {
			return sell;
		}

		/**
		 * @param sell the sell to set
		 */
		public void setSell(String sell) {
			this.sell = sell;
		}

	}
	
	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
