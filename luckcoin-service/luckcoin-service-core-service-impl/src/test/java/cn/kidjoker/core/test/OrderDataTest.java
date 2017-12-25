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
 *	创建时间: 2017年12月25日 下午3:43:24
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.CoinType;
import cn.kidjoker.core.model.OrderData;
import cn.kidjoker.core.service.OrderDataService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午3:43:24
 */
public class OrderDataTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(OrderDataTest.class);
	
	@Autowired
	private OrderDataService orderDataService;
	
	@Test
	public void testAdd() {
		OrderData orderData = new OrderData();
		orderData.setOrderNo("123");
		orderData.setInitiatorInfo("123123");
		orderData.setReceiverUserNo("6786376464");
		
		orderDataService.add(orderData);
	}
	
	@Test
	public void testQuery() {
		OrderData orderData = new OrderData();
		orderData.setOrderNo("123");
		orderData = orderDataService.getModel(orderData);
		
		System.out.println(orderData.getReceiverUserNo());
	}
	
	@Test
	public void testUpdate() {
		OrderData orderData = new OrderData();
		orderData.setOrderNo("123");
		orderData.setTradeStatus("1");
		
		orderDataService.update(orderData);
	}
	
	@Test
	public void testDelete() {
		
		orderDataService.delete("123");
	}
	
}
