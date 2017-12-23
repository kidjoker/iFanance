/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.SellerDao;
import cn.kidjoker.core.model.Seller;
import cn.kidjoker.core.service.SellerService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
@Service
public class SellerServiceImpl extends MybatisBaseServiceImpl<Seller, String, SellerDao> implements SellerService {
	
	@Autowired
	private SellerDao baseDao;
	
	@Override
	public SellerDao getBaseDao() {
		return this.baseDao;
	}

}
