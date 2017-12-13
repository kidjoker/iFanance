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
 *	创建时间: 2017年12月13日 下午2:41:26
 */
package cn.kidjoker.common.model;

import java.util.List;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:41:26
 */
public interface IPageModel<T> extends java.io.Serializable {
	
	public List<T> getDataList();

	public int getTotalRecord();

	public IPageQueryModel getPageQueryModel();
	
}
