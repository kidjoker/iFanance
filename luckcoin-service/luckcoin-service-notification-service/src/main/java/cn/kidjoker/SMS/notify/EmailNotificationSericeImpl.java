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

import org.apache.commons.mail.HtmlEmail;

/**
 * <p>
 * 邮箱通知服务
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月25日 下午6:28:27
 */
public class EmailNotificationSericeImpl {
	
	public static void main(String[] args) {
		
		HtmlEmail email = new HtmlEmail();
		
		try {
			email.setHostName("smtp.qq.com");  
            // 字符编码集的设置  
            email.setCharset("gbk");  
            // 收件人的邮箱  
            email.addTo("13621952184@163.com");  
            // 发送人的邮箱  
            email.setFrom("397602769@qq.com", "jinzhijie");  
            // 如果需要认证信息的话，设置认证：用户名-密码。分别为发件人在邮件服务器上的注册名称和密码  
            email.setAuthentication("397602769@qq.com", "itopdppqeambbjfi");  
            email.setSubject("下午3：00会议室讨论，请准时参加");  
            // 要发送的信息，由于使用了HtmlEmail，可以在邮件内容中使用HTML标签  
            email.setMsg("<h1 style='color:red'>下午3：00会议室讨论</h1>" + " 请准时参加！");  
            // 发送  
            email.send();  
  
            System.out.println("邮件发送成功!");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("邮件发送失败!"); 
		}
		
	}
}
