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
 *	创建时间: 2017年12月13日 下午2:37:49
 */
package cn.kidjoker.common.model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:37:49
 */
public interface IBaseModel<PK extends Serializable> extends Serializable {
	
	/**
	 * 获取数据记录主键
	 */
	public PK getId();

	/**
	 * 设置主键
	 */
	public void setId(PK id);
}
