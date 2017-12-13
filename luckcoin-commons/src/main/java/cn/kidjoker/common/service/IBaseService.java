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
 *	创建时间: 2017年12月13日 下午2:36:04
 */
package cn.kidjoker.common.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import cn.kidjoker.common.model.IBaseModel;
import cn.kidjoker.common.model.IPageQueryModel;
import cn.kidjoker.common.model.PageModel;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月13日 下午2:36:04
 */
public interface IBaseService<M extends IBaseModel<PK>, PK extends Serializable> {
	
	/**
	 * 添加实体
	 * 
	 * @param t
	 * @return
	 */
	public M add(M t);
	
	/**
	 * 修改实体
	 * 
	 * @param t
	 * @return
	 */
	public M update(M t);
	
	/**
	 * 删除实体
	 * @param id
	 */
	public int delete(PK key);
	
	/**
	 * 删除指定条件实体
	 * @param id
	 */
	public int delete(M m) ;

	/**
	 * 删除指定条件实体
	 * @param id
	 */
	public int delete(Map<String,Object> params) ;

	/**
	 * 删除所有实体
	 * @param id
	 */
	public int deleteAll();

	/**
	 * 删除指定的所有实体
	 * @param id
	 */
	public int delete(PK pks[]);
	
	/**
	 * 根据Key查询单个实体
	 * 
	 * @param param
	 * @return
	 */
	public M getModel(PK id);
	
	/**
	 * 根据实体条件查询单个实体
	 * 
	 * @param param
	 * @return
	 */
	public M getModel(M m);
	
	/**
	 * 根据查询条件查询单个实体
	 * 
	 * @param param
	 * @return
	 */
	public M getModel(Map<String,Object> param);
	
	/**
	 * 查询所有列表
	 * @param param
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<M> getAllList();
	
	/**
	 * 查询列表
	 * @param m
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<M> getList(M m);
	
	/**
	 * 查询列表
	 * @param param
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<M> getList(Map<String,Object> param);

	/**
	 * 查询分页列表
	 * @param param
	 * @param start
	 * @param limit
	 * @return
	 */
	public PageModel<M> getPageList(Map<String,Object> param,IPageQueryModel pageQueryModel);

	/**
	 * 查询分页列表
	 * @param m
	 * @param start
	 * @param limit
	 * @return
	 */
	public PageModel<M> getPageList(M m,IPageQueryModel pageQueryModel);
	
	/**
	 * 根据输入条件查询数量
	 * 
	 * @param queryParams
	 * @return
	 */
	public Integer selectCount(Map<String, Object> queryParams);
	
	/** 
	 * 根据输入条件查询数量
	 * 
	 * @param queryParams
	 * @return
	 */
	public Integer selectCount(M m);
	
}
