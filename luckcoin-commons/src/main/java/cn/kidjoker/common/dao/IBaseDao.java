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
 *	创建时间: 2017年12月13日 下午2:22:33
 */
package cn.kidjoker.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

/**
 * <p>
 * 通用dao-数据服务接口
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:22:33
 */
public interface IBaseDao<M extends Serializable, PK extends Serializable> {
	
	/**
	 * 添加实体
	 * 
	 * @param t
	 * @return
	 * @throws DataAccessException
	 */
	public int insert(M t) throws DataAccessException;
	
	/**
	 * 修改实体
	 * 
	 * @param t
	 * @return
	 * @throws DataAccessException
	 */
	public int update(M t) throws DataAccessException;
	
	/**
	 * 删除指定Key的实体
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteById(PK id) throws DataAccessException;
	
	/**
	 * 根据条件删除实体
	 * 
	 * @param m
	 * @return
	 * @throws DataAccessException
	 */
	public int delete(M m) throws DataAccessException;
	
	/**
	 * 根据条件删除实体
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public int delete(Map<String,Object> param) throws DataAccessException;
	
	/**
	 * 删除全部实体
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteAll() throws DataAccessException;
	
	/**
	 * 根据传入的实体数组，批量删除
	 * 
	 * @param pks
	 * @return
	 * @throws DataAccessException
	 */
	public int batchDelete(PK pks[])  throws DataAccessException;
	
	/**
	 * 
	 * 根据Key查询单个实体
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public M selectById(PK id) throws DataAccessException;
	
	/**
	 * 
	 * 根据输入条件查询单个实体
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public M selectOne(M m) throws DataAccessException;
	
	/**
	 * 
	 * 根据输入条件查询单个实体
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public M selectOne(Map<String, Object> queryParams) throws DataAccessException;
	
	/** 
	 * 查询所有列表
	 *
	 * @param rowBounds
	 * @param queryParams
	 * @return
	 */
	public List<M> selectAll() throws DataAccessException;
	
	/**
	 * 根据实体条件查询列表
	 * 
	 * @param queryParams
	 * @param m
	 * @return
	 * @throws DataAccessException
	 */
	public List<M> selectList(M m) throws DataAccessException;
	
	/**
	 * 根据map条件查询列表
	 * 
	 * @param queryParams
	 * @return
	 * @throws DataAccessException
	 */
	public List<M> selectList(Map<String, Object> queryParams) throws DataAccessException;
	
	/**
	 * 根据实体条件查询分页列表
	 * 
	 * @param m
	 * @param start
	 * @param limit
	 * @return
	 * @throws DataAccessException
	 */
	public List<M> selectPageList(M m,int start,int limit) throws DataAccessException;
	
	/**
	 * 根据map条件查询分页列表
	 * 
	 * @param queryParams
	 * @param start
	 * @param limit
	 * @return
	 * @throws DataAccessException
	 */
	public List<M> selectPageList(Map<String, Object> queryParams,int start,int limit) throws DataAccessException;
		
	/**
	 * 根据输入条件查询数量
	 * 
	 * @param queryParams
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(Map<String, Object> queryParams) throws DataAccessException;
	
	/** 
	 * 根据输入条件查询数量
	 * 
	 * @param queryParams
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(M m) throws DataAccessException;
}
