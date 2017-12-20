package cn.kidjoker.search.data.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.util.IClientService;
import cn.kidjoker.search.data.service.SearchDataService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:48:58
 * @version 1.0.0
 */
@Service
public class SearchDataServiceImpl implements SearchDataService {

	private Logger logger = LoggerFactory.getLogger(SearchDataServiceImpl.class);
	
	@Autowired
	private IClientService iClientService;
	
	
	@Override
	public Map<String, String> searchData(String requestUrl, Map<String, String> params) {
		
		params = iClientService.sendAndReceive(params, requestUrl);
		System.out.println(params);
		
		return params;
	}

}
