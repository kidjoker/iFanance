package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.OkcoinDepthDao;
import cn.kidjoker.core.dao.OkcoinTickerDao;
import cn.kidjoker.core.model.OkcoinDepthData;
import cn.kidjoker.core.model.OkcoinTickerData;
import cn.kidjoker.core.service.OkcoinDepthDataService;
import cn.kidjoker.core.service.OkcoinTickerDataService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年1月1日 - 下午3:24:15
 * @version 1.0.0
 */
public class OkcoinDepthDataServiceImpl extends MybatisBaseServiceImpl<OkcoinDepthData, String, OkcoinDepthDao> implements OkcoinDepthDataService {
	
	@Autowired
	private OkcoinDepthDataService baseDao;
	
	@Override
	public OkcoinDepthDao getBaseDao() {
		return null;
	}

}
