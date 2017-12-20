package cn.kidjoker.search.data.service;

import java.util.Map;

/**
 *
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 上午12:48:45
 * @version 1.0.0
 */
public interface SearchDataService {
	
	public Map<String, String> searchData(String requestUrl, Map<String, String> params);
}
