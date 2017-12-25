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
 *	创建时间: 2017年12月25日 下午4:36:26
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.OrderData;
import cn.kidjoker.core.model.Seller;
import cn.kidjoker.core.service.SellerService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午4:36:26
 */
public class SellerTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(SellerTest.class);
	
	@Autowired
	private SellerService sellerService;
	
	@Test
	public void testAdd() {
		Seller seller = new Seller();
		seller.setSellerId("123");
		
		sellerService.add(seller);
	}
	
	@Test
	public void testQuery() {
		Seller seller = new Seller();
		seller.setSellerId("123");
		seller = sellerService.getModel(seller);
		
		logger.debug("{}",seller.getTradeCount());
	}
	
	@Test
	public void testUpdate() {
		Seller seller = new Seller();
		seller.setSellerId("123");
		seller.setTradeCount("1233");
		
		sellerService.update(seller);
	}
	
	@Test
	public void testDelete() {
		
		sellerService.delete("123");
	}
	
}
