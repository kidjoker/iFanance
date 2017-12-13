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
 *	创建时间: 2017年12月13日 下午2:54:33
 */
package cn.kidjoker.common.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

import cn.kidjoker.common.dao.IBaseDao;
import cn.kidjoker.common.model.IBaseModel;
import cn.kidjoker.common.service.IBaseService;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:54:33
 */
public abstract class BaseServiceImpl <M extends IBaseModel<PK>, PK extends Serializable, D extends IBaseDao<M, PK>> implements IBaseService<M, PK> {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public abstract D getBaseDao();
	
	//TODO 建立异常体系
	
	public M add(M t) {
		int ret = this.getBaseDao().insert(t);
		if (ret == 1) {
			return t;
		}
		return null;
	}

	public M update(M t) {
		int ret = this.getBaseDao().update(t);
		if (ret == 1) {
			return t;
		}
		return null;
	}
	
	public int delete(PK key) {

		return this.getBaseDao().deleteById(key);
	}

	public int delete(M m) {

		return this.getBaseDao().delete(m);
	}

	public int delete(Map<String, Object> params) {

		return this.getBaseDao().delete(params);
	}
	
	public int delete(PK pks[]) {

		return this.getBaseDao().batchDelete(pks);
	}

	public int deleteAll() {

		return this.getBaseDao().deleteAll();
	}

	public M getModel(PK id) {

		return this.getBaseDao().selectById(id);
	}

	public M getModel(M m) {

		return this.getBaseDao().selectOne(m);
	}

	public M getModel(Map<String, Object> param) {
		return this.getBaseDao().selectOne(param);
	}

	public List<M> getAllList() {
		return this.getBaseDao().selectAll();
	}
	
	public List<M> getList(M m) {
		return this.getBaseDao().selectList(m);
	}
	public List<M> getList(Map<String, Object> param) {
		return this.getBaseDao().selectList(param);
	}
	
	public Integer selectCount(Map<String, Object> param) {
		return this.getBaseDao().selectCount(param);
	}

	public Integer selectCount(M m) {
		return this.getBaseDao().selectCount(m);
	}

}
