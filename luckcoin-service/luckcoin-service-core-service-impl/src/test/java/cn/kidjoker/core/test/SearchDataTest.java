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
 *	创建时间: 2017年12月26日 下午12:06:24
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.OkcoinTickerData;
import cn.kidjoker.core.service.OkcoinTickerDataService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月26日 下午12:06:24
 */
public class SearchDataTest extends AbstractTest {
	
private Logger logger = LoggerFactory.getLogger(SearchDataTest.class);
	
	@Autowired
	private OkcoinTickerDataService searchDataService;
	
	@Test
	public void testAdd() {
		OkcoinTickerData searchData = new OkcoinTickerData();
		searchData.setCoinType("btc");
		searchData.setHigh("12121");
		searchData.setLow("123312");
		searchData.setLast("1231");
		searchData.setBuy("123");
		searchData.setSell("123132");
		
		searchDataService.add(searchData);
	}
}
