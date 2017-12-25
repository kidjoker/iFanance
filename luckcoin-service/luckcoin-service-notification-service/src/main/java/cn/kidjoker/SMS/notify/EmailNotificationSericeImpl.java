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
 *	创建时间: 2017年12月25日 下午6:28:27
 */
package cn.kidjoker.SMS.notify;

import java.rmi.registry.Registry;
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import cn.kidjoker.common.test.AbstractTest;

/**
 * <p>
 * 邮箱通知服务
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午6:28:27
 */
public class EmailNotificationSericeImpl extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(EmailNotificationSericeImpl.class);
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Test 
	public void testMail() {
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom("13621952184@163.com");
			mailMessage.setTo("397602769@qq.com");
			mailMessage.setSubject("test Mail");
			mailMessage.setText("text/html;charset=utf-8");
			mailMessage.setSentDate(new Date());
			javaMailSender.send(mailMessage);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
