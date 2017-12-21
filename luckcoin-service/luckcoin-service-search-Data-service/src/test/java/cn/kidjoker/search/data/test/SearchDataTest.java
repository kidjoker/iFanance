package cn.kidjoker.search.data.test;

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
	public void testSearchData() {
		
		String hostUrl = "https://www.okex.com/api/v1";
		
		String serviceName = "/ticker";
		
		String requestUrl = hostUrl + serviceName + ".do";
		
		Map<String, String> param = new HashMap<>();
		param.put("symbol", "pro_eth");
		
		System.out.println(searchDataService.searchData(requestUrl, param));
	}
}
