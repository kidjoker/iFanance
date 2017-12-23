package cn.kidjoker.search.data.service;

import java.util.List;
import java.util.Map;

import cn.kidjoker.search.data.bo.SearchDataBo;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:48:45
 * @version 1.0.0
 */
public interface SearchDataService {
	
	public SearchDataBo searchData(String requestUrl, Map<String, String> params);
}
