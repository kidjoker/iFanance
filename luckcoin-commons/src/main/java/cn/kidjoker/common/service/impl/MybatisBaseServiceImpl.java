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
 *	创建时间: 2017年12月13日 下午3:00:06
 */
package cn.kidjoker.common.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.kidjoker.common.dao.IMybatisBaseDao;
import cn.kidjoker.common.model.IBaseModel;
import cn.kidjoker.common.model.IPageQueryModel;
import cn.kidjoker.common.model.PageModel;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午3:00:06
 */
public abstract class MybatisBaseServiceImpl <M extends IBaseModel<PK>, PK extends Serializable, D extends IMybatisBaseDao<M, PK>> extends BaseServiceImpl<M, PK, D> {
	
	public PageModel<M> getPageList(Map<String, Object> param,IPageQueryModel pageQueryModel) {

		RowBounds rowBounds = new RowBounds(pageQueryModel.getStart(), pageQueryModel.getLimit());
		List<M> list = this.getBaseDao().selectList(rowBounds, param);
		int count = this.getBaseDao().selectCount(param);
		PageModel<M> pageData = new PageModel<M>(count, list,pageQueryModel);
		return pageData;
	}

	public PageModel<M> getPageList(M m,IPageQueryModel pageQueryModel) {

		RowBounds rowBounds = new RowBounds(pageQueryModel.getStart(), pageQueryModel.getLimit());
		List<M> list = this.getBaseDao().selectList(rowBounds, m);
		int count = this.getBaseDao().selectCount(m);
		PageModel<M> pageData = new PageModel<M>(count, list,pageQueryModel);
		return pageData;
	}
	
}
