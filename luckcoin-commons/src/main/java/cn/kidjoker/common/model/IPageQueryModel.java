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
 *	创建时间: 2017年12月13日 下午2:42:41
 */
package cn.kidjoker.common.model;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:42:41
 */
public interface IPageQueryModel {
	
	public static String PAGE_QUERY_MODEL_TYPE_COMMOM="common";
	
	public static String PAGE_QUERY_MODEL_TYPE_DATATABLE="datatable";
	
	public int getStart();
	
	public int getLimit();
	
	public int getPage();
	
	public String getType();
	
}
