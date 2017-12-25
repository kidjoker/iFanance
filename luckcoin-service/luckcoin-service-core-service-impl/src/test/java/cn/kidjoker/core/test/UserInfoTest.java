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
 *	创建时间: 2017年12月25日 下午5:11:11
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.TradeFee;
import cn.kidjoker.core.model.UserInfo;
import cn.kidjoker.core.service.UserInfoService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午5:11:11
 */
public class UserInfoTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(UserInfoTest.class);
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void testAdd() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserNo("123");
		
		userInfoService.add(userInfo);
	}
	
	@Test
	public void testQuery() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserNo("123");
		userInfo = userInfoService.getModel(userInfo);
		
		System.out.println(userInfo.getCreateTime());
	}
	
	@Test
	public void testUpdate() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserNo("123");
		userInfo.setMobile("242424324");
		
		userInfoService.update(userInfo);
	}
	
	@Test
	public void testDelete() {
		
		userInfoService.delete("123");
	}
}
