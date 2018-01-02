package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.OkcoinKlineDao;
import cn.kidjoker.core.model.OkcoinKlineData;
import cn.kidjoker.core.service.OkcoinKlineDataService;

/**
 *
 *
 * @auther KidjokeR
 * @since 2018年1月1日 - 下午3:26:40
 * @version 1.0.0
 */
public class OkcoinKlineDataServiceImpl extends MybatisBaseServiceImpl<OkcoinKlineData, String, OkcoinKlineDao> implements OkcoinKlineDataService{
	
	@Autowired
	private OkcoinKlineDao baseDao;
	
	@Override
	public OkcoinKlineDao getBaseDao() {
		return null;
	}

}
