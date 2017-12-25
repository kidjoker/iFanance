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
 *	创建时间: 2017年12月25日 下午5:18:53
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.TradeFee;
import cn.kidjoker.core.model.WalletHistory;
import cn.kidjoker.core.service.WalletHistoryService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午5:18:53
 */
public class WalletHistoryTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(WalletHistoryTest.class);
	
	@Autowired
	private WalletHistoryService walletHistoryService;
	
	@Test
	public void testAdd() {
		WalletHistory walletHistory = new WalletHistory();
		walletHistory.setWalletHistorySeq("123");
		
		walletHistoryService.add(walletHistory);
	}
	
	@Test
	public void testQuery() {
		WalletHistory walletHistory = new WalletHistory();
		walletHistory.setWalletHistorySeq("123");
		walletHistory = walletHistoryService.getModel(walletHistory);
		
		System.out.println(walletHistory.getWalletHistorySeq());
	}
	
	@Test
	public void testUpdate() {
		WalletHistory walletHistory = new WalletHistory();
		walletHistory.setWalletHistorySeq("123");
		walletHistory.setTradeType("3");
		
		walletHistoryService.update(walletHistory);
	}
	
	@Test
	public void testDelete() {
		
		walletHistoryService.delete("123");
	}
}
