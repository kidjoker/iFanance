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
 *	创建时间: 2017年12月25日 下午4:47:53
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.Seller;
import cn.kidjoker.core.model.TradeFee;
import cn.kidjoker.core.service.SellerService;
import cn.kidjoker.core.service.TradeFeeService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午4:47:53
 */
public class TradeFeeTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(TradeFeeTest.class);
	
	@Autowired
	private TradeFeeService tradeFeeService;
	
	@Test
	public void testAdd() {
		TradeFee tradeFee = new TradeFee();
		tradeFee.setTradeFeeSeq("123");
		
		tradeFeeService.add(tradeFee);
	}
	
	@Test
	public void testQuery() {
		TradeFee tradeFee = new TradeFee();
		tradeFee.setTradeFeeSeq("123");
		tradeFee = tradeFeeService.getModel(tradeFee);
		
		System.out.println(tradeFee.getTradeFeeSeq());
	}
	
	@Test
	public void testUpdate() {
		TradeFee tradeFee = new TradeFee();
		tradeFee.setTradeFeeSeq("123");
		tradeFee.setTradeType("2");
		
		tradeFeeService.update(tradeFee);
	}
	
	@Test
	public void testDelete() {
		
		tradeFeeService.delete("123");
	}
	
}
