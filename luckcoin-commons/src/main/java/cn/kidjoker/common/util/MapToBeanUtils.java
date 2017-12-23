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
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.hamcrest.core.IsInstanceOf;

/**
 * <p>
 * 	将一个map数据转为javaBean
 * </P>
 * 
 * @author jinzhijie
 * @creatTime 2017年12月22日 下午4:31:39
 */
public class MapToBeanUtils {
	
	@SuppressWarnings("unchecked")
	public static <Type> Type toBean(Class<Type> type, Map map) {
		
		Type obj = null;
		
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(type);  //获取类型信息
			obj = type.newInstance();  //通过反射机制, 使用默认构造函数生成一个空对象
			
			//解析map参数,并给bean对象赋值
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for(int i = 0; i < propertyDescriptors.length; i++) {
				PropertyDescriptor descriptor = propertyDescriptors[i];
				String propertyName = descriptor.getName();
				Class<?> propertyType = descriptor.getPropertyType();
				
				if(map.containsKey(propertyName)) {
					Object value = map.get(propertyName);
					if("".equals(value)) {
						value = null;
					}
					
					if(value instanceof Map) {
						value = toBean(propertyType, (Map) value);
					}
					
					//调用setter函数
					Object[] args = new Object[1];
					args[0] = value;
					
					try {
						descriptor.getWriteMethod().invoke(obj, args);
					}
					catch(InvocationTargetException e) {
						System.out.println("字段映射失败");
					}
				}
			}
		}
		catch (IllegalAccessException e) {
			System.out.println("Javabean 访问权限限制");
		}
		catch (IntrospectionException e) {
			System.out.println("分析 Javabean 属性失败");
		}
		catch (IllegalArgumentException e) {
			System.out.println("映射错误");
		}
		catch (InstantiationException e) {
			System.out.println("实例化 Javabean 失败");
		}
		
		return (Type) obj;
	}
}
