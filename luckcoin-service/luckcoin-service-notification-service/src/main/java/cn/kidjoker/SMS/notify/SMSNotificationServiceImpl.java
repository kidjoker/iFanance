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
 *	创建时间: 2017年12月25日 下午6:04:36
 */
package cn.kidjoker.SMS.notify;

import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

import cn.kidjoker.common.test.AbstractTest;

/**
 * <p>
 * 短信通知服务
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午6:04:36
 */
@Service
public class SMSNotificationServiceImpl {
	
	private Logger logger = LoggerFactory.getLogger(SMSNotificationServiceImpl.class);
	
	@Value(value = "${yuanpian.SMS.mobile}")
	private String mobile;	
	
	@Value(value = "${yuanpian.SMS.content}")
	private String content;
	
	@Autowired
	private YunpianClient yunpianClient;
	
	public void testSMSNotify() {
		
		logger.info("开始发送短信 接收方[{}], 短信内容[{}]",mobile, content);
		
		try {
			YunpianClient client = yunpianClient.init();
			Map<String, String> param = client.newParam(2);
			param.put(YunpianClient.MOBILE, mobile);
			param.put(YunpianClient.TEXT, content);
			Result<SmsSingleSend> r = client.sms().single_send(param);
			
			client.close();
		}
		catch (Exception e) {
			//TODO 异常处理需要完善
			e.printStackTrace();
		}
		
		logger.info("短信 发送成功");
	}
}
