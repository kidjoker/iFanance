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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import cn.kidjoker.batch.service.DTO.ApiDataContext;
import cn.kidjoker.common.annotations.HostName;
import cn.kidjoker.common.annotations.ServiceName;
import cn.kidjoker.common.param.CommonParam;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2017年12月14日 下午1:08:41
 */
@Service
public abstract class AbstractApiSearchService {
	
	private Logger LOG = LoggerFactory.getLogger(AbstractApiSearchService.class);
	
	@Value("${api.host.url}")
	private String hostUrls;
	
	@Value("${api.coinType.name}")
	private String cointypes;
	
	public void execute() throws Exception {
		
		//选择对应api网址
		String hostUrl = chooseHost();
		
		//选择对应服务
		String requestUrl =chooseServiceName(hostUrl);
		
		//组织请求参数
		Map<String, List<String>> param = organizeRequestParam();
		
		//进行api调用抓取数据
		ApiDataContext data = doSearchData(requestUrl, param);
		
		//进行数据存储
		save2DB(data);
		save2CSV(data);
	}
	
	private String chooseHost() {
		String[] hostUrlArr = hostUrls.split(CommonParam.PATTERN);
		String hostName = this.getClass().getAnnotation(HostName.class).hostName();
		for(String hostUrl : hostUrlArr) {
			if(hostUrl.contains(hostName)) {
				LOG.info("成功找到api数据源[{}],开始配置参数并进行api调用", hostName);
				return hostUrl;
			}
		}
		
		LOG.info("无对应的api数据源[{}],请检查配置", hostName);
		return null;
	}
	
	private String chooseServiceName(String hostUrl) {
		return hostUrl + this.getClass().getAnnotation(ServiceName.class).serviceName();
	}
	
	protected Map<String, List<String>> organizeRequestParam() {
		Object properties = 
	}
	
	protected abstract ApiDataContext doSearchData(String requestUrl, Map<String, List<String>> param);
	
	protected abstract void save2DB(ApiDataContext Ddata);
	
	protected abstract void save2CSV(ApiDataContext Ddata) throws IOException;
	
}
