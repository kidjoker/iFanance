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
 *	创建时间: 2017年12月13日 下午2:43:39
 */
package cn.kidjoker.common.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:43:39
 */
public class PageModel<T> implements java.io.Serializable, IPageModel<T> {
	
	private int totalRecord;  // 总记录数
	private List<T> data;  // 分页数据
	private IPageQueryModel pageQueryModel;

	public PageModel() {
		
	}

	public PageModel(final int totalRecord, List<T> data) {
		
		// 设置总记录数
		this.totalRecord = totalRecord;
		
		// 设置数据
		this.data = data;
	}

	public PageModel(final int totalRecord, List<T> data,
			IPageQueryModel pageQueryModel) {

		// 设置总记录数
		this.totalRecord = totalRecord;
		
		// 设置数据
		this.data = data;

		this.pageQueryModel = pageQueryModel;

	}

	public List<T> getDataList() {
		return data;
	}

	public int getTotalRecord() {
		return totalRecord;
	}
	
	public IPageQueryModel getPageQueryModel() {
		return pageQueryModel;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> retData = new HashMap<String, Object>();
		retData.put("totalRecord", this.totalRecord);
		retData.put("data", this.data);
		return retData;
	}

	@Override
	public String toString() {
		return this.toMap().toString();
	}

	
}
