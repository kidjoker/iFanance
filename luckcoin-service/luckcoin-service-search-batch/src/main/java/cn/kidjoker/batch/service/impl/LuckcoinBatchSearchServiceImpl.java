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
	
	@Value(value="${luckcoin.search.data.url}")
	private String requestUrl;
	
	private String[] coinType = {"ltc_btc", "eth_btc", "etc_btc", "bch_btc", "bt1_btc", "bt2_btc", "btg_btc", "qtum_btc", "hsr_btc", "neo_btc", "gas_btc",
			"btc_usdt", "eth_usdt", "ltc_usdt", "etc_usdt", "bch_usdt",
			"etc_eth", "qtum_usdt", "hsr_usdt", "neo_usdt", "gas_usdt"};
	
	@Override
	public void execute() throws Exception {
		Map<String, String> param = new HashMap<>();
		param.put("symbol", coinType[0]);
		
		searchDataService.searchData(requestUrl, param);
	}
	
}
