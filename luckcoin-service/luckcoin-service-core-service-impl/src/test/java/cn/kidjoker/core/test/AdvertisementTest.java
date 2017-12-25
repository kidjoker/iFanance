/** work for life!
 * 
 */
package cn.kidjoker.core.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.Advertisement;
import cn.kidjoker.core.service.AdvertisementService;

/**
 * @author kidjoker
 *
 * @date 2017年12月17日 
 */
public class AdvertisementTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(AdvertisementTest.class);
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@Test
	public void testAdd() {
		Advertisement adv = new Advertisement();
		adv.setAdId("1234567811");
		adv.setAdName("hahaha");
		advertisementService.add(adv);
		logger.info("添加成功 {}", adv.getAdId());
	}
	
	@Test
	public void testQuery() {
		Map<String, Object> queryParams = new HashMap<>();
		queryParams.put("adId", "12");
		Advertisement adv = advertisementService.getModel(queryParams);
		
		System.out.println(adv.getAdName());
	}
	
	@Test
	public void testUpdate() {
		Advertisement adv = new Advertisement();
		adv.setAdId("12");
		adv.setAdName("xixixi");
		advertisementService.update(adv);
	}
	
	@Test
	public void testDelete() {
		
		advertisementService.delete("12");
	}
}
