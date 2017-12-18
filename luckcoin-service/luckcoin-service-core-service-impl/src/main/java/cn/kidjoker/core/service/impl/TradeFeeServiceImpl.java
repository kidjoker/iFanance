/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.TradeFeeDao;
import cn.kidjoker.core.model.TradeFee;
import cn.kidjoker.core.service.TradeFeeService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
@Service
public class TradeFeeServiceImpl extends MybatisBaseServiceImpl<TradeFee, String, TradeFeeDao> implements TradeFeeService {
	
	@Autowired
	private TradeFeeDao baseDao;
	
	@Override
	public TradeFeeDao getBaseDao() {
		return this.baseDao;
	}

}
