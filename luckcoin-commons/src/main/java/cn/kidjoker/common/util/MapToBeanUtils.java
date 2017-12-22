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
 *	创建时间: 2017年12月22日 下午4:31:39
 */
package cn.kidjoker.common.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Map;

/**
 * <p>
 * 	将一个map数据转为javaBean
 * </P>
 * 
 * @author jinzhijie
 * @creatTime 2017年12月22日 下午4:31:39
 */
public class MapToBeanUtils {
	
	public static <Type> Type toBean(Class<Type> type, Map map) {
		
		Type obj = null;
		
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(type);  //获取类型信息
			obj = type.newInstance();  //通过反射机制, 使用默认构造函数生成一个空对象
			
			//解析map参数,并给bean对象赋值
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			
		
		}
	}
}
