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
 *	创建时间: 2017年12月27日 下午1:25:28
 */
package cn.kidjoker.batch.service.impl;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月27日 下午1:25:28
 */
public class OkcoinDepthServiceImpl extends AbstractBatchSearchService {

	@Override
	protected String chooseService() {
		return null;
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
