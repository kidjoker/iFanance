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
 *	创建时间: 2017年12月27日 下午1:27:04
 */
package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.isApiServiceUsable;
import cn.kidjoker.batch.service.DTO.ApiDataContext;
import cn.kidjoker.common.annotations.ServiceName;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月27日 下午1:27:04
 */
@Service
@ServiceName(serviceName="/kline.do")
public class OkcoinKlineServiceImpl extends AbstractBatchSearchService implements isApiServiceUsable {
	
	@Override
	protected Map<String, String> organizeRequestParam() {
		Map<String, String> param = new HashMap<>();
		
		param.put("symbol", value)
	}

	@Override
	protected ApiDataContext doSearchData(String requestUrl, Map<String, String> param) {
		return null;
	}

	@Override
	protected void save2DB(ApiDataContext Ddata) {
	}

	@Override
	protected void save2CSV(ApiDataContext Ddata) throws IOException {
	}

	

}
