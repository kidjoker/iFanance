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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.mysql.jdbc.log.Log;

import cn.kidjoker.batch.service.BatchSearchService;
import cn.kidjoker.batch.service.DTO.ApiDataContext;
import cn.kidjoker.common.annotations.DataSource;
import cn.kidjoker.common.annotations.ServiceName;
import cn.kidjoker.common.api.type.support.EnumApiDataSourceType;
import cn.kidjoker.common.param.CommonParam;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月14日 下午1:08:41
 */
public abstract class AbstractApiSearchService {
	
	private Logger LOG = LoggerFactory.getLogger(AbstractApiSearchService.class);
	
	@Value("api.host.url")
	private String hostUrls;
	
	@Value("api.coinType.name")
	private String cointypes;
	
	protected void execute() throws Exception {
		
		EnumApiDataSourceType[] apiSources = EnumApiDataSourceType.values();
		
		for(EnumApiDataSourceType apiSource : apiSources) {
			
			//选择对应api网址
			String hostUrl = chooseHost(apiSource);
			
			//选择对应服务
			String requestUrl =chooseServiceName(hostUrl);
			
			//组织请求参数
			Map<String, String> param = organizeRequestParam();
			
			//进行api调用抓取数据
			ApiDataContext data = doSearchData(requestUrl, param);
			
			//进行数据存储
			save2DB(data);
			save2CSV(data);
			
		}
	}
	
	private String chooseHost(EnumApiDataSourceType apiSource) {
		
		String[] hostUrlArr = hostUrls.split(CommonParam.PATTERN);
		for(String hostUrl : hostUrlArr) {
			if(hostUrl.contains(apiSource.getServiceName())) {
				LOG.error("成功找到api数据源[{}],开始配置参数并进行api调用", apiSource.getServiceName());
				return hostUrl;
			}
		}
		
		LOG.error("无对应的api数据源[{}],请检查配置", apiSource.getServiceName());
		return null;
	}
	
	private String chooseServiceName(String hostUrl) {
		return hostUrl + this.getClass().getAnnotation(ServiceName.class).serviceName();
	}
	
	protected abstract Map<String, String> organizeRequestParam();
	
	protected abstract ApiDataContext doSearchData(String requestUrl, Map<String, String> param);
	
	protected abstract void save2DB(ApiDataContext Ddata);
	
	protected abstract void save2CSV(ApiDataContext Ddata) throws IOException;
	
}
