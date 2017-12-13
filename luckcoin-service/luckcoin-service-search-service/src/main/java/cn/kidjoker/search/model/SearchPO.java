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
 *	创建时间: 2017年12月13日 下午3:12:09
 */
package cn.kidjoker.search.model;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午3:12:09
 */
public class SearchPO extends BaseModelAdapter<Long> {
	
	private String variable1;
	
	private String variable2;
	
	private String variable3;

	public String getVariable1() {
		return variable1;
	}

	public void setVariable1(String variable1) {
		this.variable1 = variable1;
	}

	public String getVariable2() {
		return variable2;
	}

	public void setVariable2(String variable2) {
		this.variable2 = variable2;
	}

	public String getVariable3() {
		return variable3;
	}

	public void setVariable3(String variable3) {
		this.variable3 = variable3;
	}
	
}
