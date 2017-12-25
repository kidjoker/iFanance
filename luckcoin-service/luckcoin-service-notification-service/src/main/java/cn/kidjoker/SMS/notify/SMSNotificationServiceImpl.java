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
import org.springframework.stereotype.Service;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

/**
 * <p>
 * 短信通知服务
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午6:04:36
 */
@Service
public class SMSNotificationServiceImpl {
	
	public void testSMSNotify(String mobile, String content) {
		
		YunpianClient client = new YunpianClient("d4999cd0f27d1fafe98b11db9a0ec264").init();
		
		Map<String, String> param = client.newParam(2);
		param.put(YunpianClient.MOBILE, mobile);
		param.put(YunpianClient.TEXT, content);
		Result<SmsSingleSend> r = client.sms().single_send(param);
		
		client.close();
	}
}
