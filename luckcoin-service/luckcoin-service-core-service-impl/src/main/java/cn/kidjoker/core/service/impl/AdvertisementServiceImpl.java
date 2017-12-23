/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.AdvertisementDao;
import cn.kidjoker.core.model.Advertisement;
import cn.kidjoker.core.service.AdvertisementService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
@Service
public class AdvertisementServiceImpl extends MybatisBaseServiceImpl<Advertisement, String, AdvertisementDao> implements AdvertisementService {
	
	@Autowired
	private AdvertisementDao baseDao;
	
	@Override
	public AdvertisementDao getBaseDao() {
		return this.baseDao;
	}

}
