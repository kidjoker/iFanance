package cn.kidjoker.search.data.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.kidjoker.common.util.IClientService;
import cn.kidjoker.search.data.service.SearchDataService;
import cn.kidjoker.search.data.vo.SearchDataBo;

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
		
		Map<String, String> retMap = iClientService.sendAndReceive(params, requestUrl);
		
		return null;
	}

}
