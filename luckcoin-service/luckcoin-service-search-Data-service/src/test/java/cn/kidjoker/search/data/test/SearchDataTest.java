package cn.kidjoker.search.data.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.search.data.bo.SearchDataBo;
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
		
		String[] coinTypes = {"btc_usd","ltc_usd","eth_usd","etc_usd","bch_usd"};
		
		Map<String, String> param = new HashMap<>();
		File csv = new File("E:\\okcoin\\btcData\\1.csv");
		BufferedWriter bw = null;
		
		for(int i = 0; i < coinTypes.length; i++) {
			
			param.put("symbol",coinTypes[i]);
			
			SearchDataBo resp = searchDataService.searchData(requestUrl, param);
			resp.setCoinType(coinTypes[i]);
			
			try {
				bw = new BufferedWriter(new FileWriter(csv, true));
				bw.write(resp.toString());
			}
			catch (FileNotFoundException e) { 
				e.printStackTrace(); 
	        } 
			catch (IOException e) { 
	        	e.printStackTrace(); 
	        }
			finally {
				bw.newLine(); 
		        bw.close();
			}
		}
	}
}
