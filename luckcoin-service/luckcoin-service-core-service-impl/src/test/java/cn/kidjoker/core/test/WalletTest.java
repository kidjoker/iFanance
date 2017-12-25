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
 *	创建时间: 2017年12月25日 下午5:27:52
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.UserInfo;
import cn.kidjoker.core.model.Wallet;
import cn.kidjoker.core.service.WalletService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午5:27:52
 */
public class WalletTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(WalletTest.class);
	
	@Autowired
	private WalletService walletService;
	
	@Test
	public void testAdd() {
		Wallet wallet = new Wallet();
		wallet.setAcctNo("123");
		
		walletService.add(wallet);
	}
	
	@Test
	public void testQuery() {
		Wallet wallet = new Wallet();
		wallet.setUserNo("123");
		wallet = walletService.getModel(wallet);
		
		System.out.println(wallet.getCreateTime());
	}
	
	@Test
	public void testUpdate() {
		Wallet wallet = new Wallet();
		wallet.setAcctNo("123");
		wallet.setWalletHistorySeq("1212313");
		
		walletService.update(wallet);
	}
	
	@Test
	public void testDelete() {
		
		walletService.delete("123");
	}
	
	
}
