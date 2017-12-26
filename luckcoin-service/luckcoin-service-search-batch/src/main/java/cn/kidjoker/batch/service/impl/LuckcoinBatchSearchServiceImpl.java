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
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.LuckcoinBatchSearchService;
import cn.kidjoker.core.model.SearchData;
import cn.kidjoker.core.service.SearchDataService;
import cn.kidjoker.search.data.bo.SearchDataBo;
import cn.kidjoker.search.data.service.LookForDataService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月14日 下午1:08:41
 */
@Service("LuckcoinSearchBatchJob")
public class LuckcoinBatchSearchServiceImpl implements LuckcoinBatchSearchService {
	
	private static final String PATTERN = ",";
	
	@Value(value = "${okcoin.host.url}")
	private String hostUrl;
	
	@Value(value = "${okcoin.service.name}")
	private String serviceName;
	
	@Value(value = "${okcoin.coinType.name}")
	private String coinType;
	
	@Autowired
	private LookForDataService lookForDataService;
	
	@Autowired
	private SearchDataService searchDataService;
	
	@Override
	public void execute() throws Exception {
		
		Map<String, String> param = new HashMap<>();
		
		String requestUrl = hostUrl + serviceName;
		
		String[] coinTypes = coinType.split(PATTERN);
		for(int i = 0; i < coinTypes.length; i++) {
			
			param.put("symbol",coinTypes[i]);
			
			SearchDataBo resp = lookForDataService.searchData(requestUrl, param);
			resp.setCoinType(coinTypes[i]);
			
			//保存到数据库中
			this.save2DB(resp);
			
			//保存到CSV文件中
			this.save2CSV(resp);
		}
	}
	
	private void save2DB(SearchDataBo searchDataBo) {
		
		String[] uuids = UUID.randomUUID().toString().split("-");
		SearchData dataToDB = new SearchData();
		dataToDB.setSearchSeq(uuids[0] + uuids[1]);
		dataToDB.setCoinType(searchDataBo.getCoinType());
		dataToDB.setLast(searchDataBo.getTicker().getLast());
		dataToDB.setLow(searchDataBo.getTicker().getLow());
		dataToDB.setHigh(searchDataBo.getTicker().getHigh());
		dataToDB.setVol(searchDataBo.getTicker().getVol());
		dataToDB.setBuy(searchDataBo.getTicker().getBuy());
		dataToDB.setSell(searchDataBo.getTicker().getSell());
		searchDataService.add(dataToDB);
	}
	
	private void save2CSV(SearchDataBo searchDataBo) throws IOException {
		
		BufferedWriter bw = null;
		File csv = new File("/usr/app/data/1.csv");
		
		try {
			bw = new BufferedWriter(new FileWriter(csv, true));
			bw.write(searchDataBo.toString());
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
