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
 *	创建时间: 2017年12月26日 上午11:40:04
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.SearchDataDao;
import cn.kidjoker.core.model.SearchData;
import cn.kidjoker.core.service.SearchDataService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月26日 上午11:40:04
 */
@Service
public class SearchDataSerivceImpl extends MybatisBaseServiceImpl<SearchData, String, SearchDataDao> implements SearchDataService {

	@Autowired
	private SearchDataDao baseDao;
	
	@Override
	public SearchDataDao getBaseDao() {
		return this.baseDao;
	}

}
