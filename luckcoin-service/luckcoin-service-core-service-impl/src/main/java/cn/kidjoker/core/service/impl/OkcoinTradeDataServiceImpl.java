package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.OkcoinTradeDao;
import cn.kidjoker.core.model.OkcoinTradeData;
import cn.kidjoker.core.service.OkcoinTradeDataService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年1月1日 - 下午3:19:02
 * @version 1.0.0
 */
public class OkcoinTradeDataServiceImpl extends MybatisBaseServiceImpl<OkcoinTradeData, String, OkcoinTradeDao> implements OkcoinTradeDataService {
	
	@Autowired
	private OkcoinTradeDao baseDao;
	
	@Override
	public OkcoinTradeDao getBaseDao() {
		return this.baseDao;
	}

}
