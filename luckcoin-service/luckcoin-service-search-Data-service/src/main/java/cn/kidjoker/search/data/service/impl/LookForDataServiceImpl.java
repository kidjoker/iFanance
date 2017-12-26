package cn.kidjoker.search.data.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.util.IClientService;
import cn.kidjoker.common.util.MapToBeanUtils;
import cn.kidjoker.search.data.bo.SearchDataBo;
import cn.kidjoker.search.data.service.LookForDataService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:48:58
 * @version 1.0.0
 */
@Service
public class LookForDataServiceImpl implements LookForDataService {

	private Logger logger = LoggerFactory.getLogger(LookForDataServiceImpl.class);
	
	@Autowired
	private IClientService iClientService;
	
	
	@SuppressWarnings("unused")
	@Override
	public SearchDataBo searchData(String requestUrl, Map<String, String> params) {
		
		Map<String, String> retMap = iClientService.sendAndReceive(params, requestUrl);
		
		SearchDataBo rawData = MapToBeanUtils.toBean(SearchDataBo.class, retMap);
		
		return rawData;
	}

}
