/** work for life!
 * 
 */
package cn.kidjoker.core.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.test.AbstractTest;
import cn.kidjoker.core.model.CoinType;
import cn.kidjoker.core.service.CoinTypeService;

/**
 * @author kidjoker
 *
 * @date 2017年12月17日 
 */
public class CoinTypeTest extends AbstractTest {
	
private Logger logger = LoggerFactory.getLogger(CoinTypeTest.class);
	
	@Autowired
	private CoinTypeService coinTypeService;
	
	@Test
	public void testAdd() {
		CoinType coinType = new CoinType();
		coinType.setCoinTypeId("1");
		coinType.setNameCh("比特币");
		
		coinTypeService.add(coinType);
	}
	
	@Test
	public void testQuery() {
		CoinType coinType = new CoinType();
		coinType.setCoinTypeId("1");
		
		CoinType adv = coinTypeService.getModel(coinType);
		
		System.out.println(adv.getNameCh());
	}
	
	@Test
	public void testUpdate() {
		CoinType coinType = new CoinType();
		coinType.setCoinTypeId("1");
		coinType.setNameCh("luck币");
		
		coinTypeService.update(coinType);
	}
	
	@Test
	public void testDelete() {
		CoinType coinType = new CoinType();
		coinType.setCoinTypeId("1");
		
		coinTypeService.delete(coinType);
	}
}
