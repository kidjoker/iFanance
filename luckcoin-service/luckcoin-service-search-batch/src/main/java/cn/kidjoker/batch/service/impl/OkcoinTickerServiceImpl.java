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
 *	创建时间: 2017年12月27日 下午1:24:21
 */
package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import cn.kidjoker.search.data.bo.SearchDataBo.Ticker;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月27日 下午1:24:21
 */
public class OkcoinTickerServiceImpl extends AbstractBatchSearchService {
	
	private String serviceName = "ticker.do";
	
	@Override
	protected String chooseService() {
		return hostUrl + serviceName;
	}

	@Override
	protected void doSearchData(String requestUrl, List<String> coinTypes) {
	}

	@Override
	protected <T> void save2DB(T Ddata) {
	}

	@Override
	protected <T> void save2CSV(T Ddata) throws IOException {
	}

}
