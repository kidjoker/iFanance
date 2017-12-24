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
 *	创建时间: 2017年12月18日 上午9:41:19
 */
package cn.kidjoker.common.test;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月18日 上午9:41:19
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
	
    static {  
        try {  
            Log4jConfigurer.initLogging("classpath:META-INF/config/log4j.xml");  
        } 
        catch (FileNotFoundException ex) {  
            System.err.println("Cannot Initialize log4j");  
        }  
    }  
      
    public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {  
        super(clazz);  
    }  

}
