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
 *	创建时间: 2017年12月14日 下午1:08:41
 */
package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import cn.kidjoker.batch.service.BatchSearchService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月14日 下午1:08:41
 */
public abstract class AbstractBatchSearchService implements BatchSearchService {
	
	private static final String PATTERN = ",";
	
	@Value(value = "${okcoin.host.url}")
	protected String hostUrl;
	
	@Value(value = "${okcoin.coinType.name}")
	protected String coinType;
	
	@Override
	public <T> void execute() throws Exception {
		
		//选择对应服务
		String requestUrl = chooseService();
		
		//组织参数
		List<String> coinTypes = organizeRequestParam();
		
		//调用数据
		doSearchData(requestUrl, coinTypes);
	}
	
	protected abstract String chooseService();
	
	protected List<String> organizeRequestParam() {
		return Arrays.asList(coinType.split(PATTERN));
	}
	
	protected abstract void doSearchData(String requestUrl, List<String> param);
	
	protected abstract <T> void save2DB(T Ddata);
	
	protected abstract <T> void save2CSV(T Ddata) throws IOException;
	
}
