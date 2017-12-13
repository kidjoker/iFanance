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
 *	创建时间: 2017年12月13日 下午2:32:58
 */
package cn.kidjoker.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.dao.DataAccessException;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:32:58
 */
public interface IMybatisBaseDao<M extends Serializable, PK extends Serializable> extends IBaseDao<M, PK> {
	
	/**
	 * 
	 * 根据输入条件查询列表
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public List<M> selectList(RowBounds rowBounds, Map<String, Object> queryParams) throws DataAccessException;
	
	
	/**
	 * 
	 * 根据输入实体查询列表
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public List<M> selectList(RowBounds rowBounds, M m) throws DataAccessException;
}
