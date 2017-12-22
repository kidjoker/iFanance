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

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.LuckcoinBatchSearchService;
import cn.kidjoker.search.data.service.SearchDataService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月14日 下午1:08:41
 */
@Service("LuckcoinSearchBatchJob")
public class LuckcoinBatchSearchServiceImpl implements LuckcoinBatchSearchService {
	
	@Autowired
	private SearchDataService searchDataService;
	
	private String hostUrl = "https://www.okcoin.com/api/v1";
	
	private String serviceName = "/ticker";
	
	private String[] coinType = {"btc_usd"};
	
	@Override
	public void execute() throws Exception {
		
		String requestUrl = hostUrl + serviceName + ".do";
		
		Map<String, String> param = new HashMap<>();
		param.put("symbol", coinType[0]);
		
		Map<String, String> retMap = searchDataService.searchData(requestUrl, param);
	}
	
}
