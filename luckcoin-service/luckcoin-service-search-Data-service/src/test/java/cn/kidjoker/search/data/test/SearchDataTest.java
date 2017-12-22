package cn.kidjoker.search.data.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.search.data.service.SearchDataService;

/**
 * 数据服务API
 *
 * @auther KidjokeR
 * @since 2017年12月21日 - 下午11:13:05
 * @version 1.0.0
 */
public class SearchDataTest extends AbstractTest {
	
	@Autowired
	private SearchDataService searchDataService;
	
	@Test
	@SuppressWarnings("unused")
	public void testSearchData() throws IOException {
		
		String hostUrl = "https://www.okcoin.com/api/v1";
		String serviceName = "/ticker";
		String requestUrl = hostUrl + serviceName + ".do";
		
		Map<String, String> param = new HashMap<>();
		param.put("symbol", "btc_usd");
		
		Map<String, String> retMap = searchDataService.searchData(requestUrl, param);
	}
}
