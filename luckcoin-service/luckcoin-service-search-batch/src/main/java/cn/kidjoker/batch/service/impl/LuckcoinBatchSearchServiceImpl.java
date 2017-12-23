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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.LuckcoinBatchSearchService;
import cn.kidjoker.search.data.bo.SearchDataBo;
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
	
	private String hostUrl = "https://www.okex.com/api/v1";
	
	private String serviceName = "/ticker";
	
	private String[] coinTypes = {"pro_eth","ltc_btc"};
	
	@Override
	public void execute() throws Exception {
		
		String requestUrl = hostUrl + serviceName + ".do";
		
		Map<String, String> param = new HashMap<>();
		File csv = new File("E:\\okcoin\\btcData\\1.csv");
		BufferedWriter bw = null;
		
		for(int i = 0; i < coinTypes.length; i++) {
			
			param.put("symbol",coinTypes[i]);
			
			SearchDataBo resp = searchDataService.searchData(requestUrl, param);
			System.out.println(resp);
			
			try {
				bw = new BufferedWriter(new FileWriter(csv, true));
				bw.write(resp.toString());
			}
			catch (FileNotFoundException e) { 
				e.printStackTrace(); 
	        } 
			catch (IOException e) { 
	        	e.printStackTrace(); 
	        }
			finally {
				bw.newLine(); 
		        bw.close();
			}
			
		}
	}
	
}
