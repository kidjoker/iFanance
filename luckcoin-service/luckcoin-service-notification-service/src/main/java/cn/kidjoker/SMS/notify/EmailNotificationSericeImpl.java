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

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮箱通知服务
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午6:28:27
 */
@Service
public class EmailNotificationSericeImpl {
	
	private Logger logger = LoggerFactory.getLogger(EmailNotificationSericeImpl.class);
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private SimpleMailMessage simpleMailMessage;
	
	public void sendMail() {
		
		logger.info("开始发送邮件 发件人[{}], 收件人[{}], 主题[{}]",
				simpleMailMessage.getFrom(),simpleMailMessage.getTo(),simpleMailMessage.getSubject());
		
		try {
			simpleMailMessage.setSentDate(new Date());
			javaMailSender.send(simpleMailMessage);
		}
		catch (Exception e) {
			//TODO 异常处理需要完善
			e.printStackTrace();
		}
		
		logger.info("邮件发送成功");
	}
	
}
