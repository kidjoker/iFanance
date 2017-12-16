/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.CoinTypeDao;
import cn.kidjoker.core.model.CoinType;
import cn.kidjoker.core.service.CoinTypeService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class CoinTypeServiceImpl extends MybatisBaseServiceImpl<CoinType, String, CoinTypeDao> implements CoinTypeService {

	@Autowired
	private CoinTypeDao baseDao;
	
	@Override
	public CoinTypeDao getBaseDao() {
		return this.baseDao;
	}

}
