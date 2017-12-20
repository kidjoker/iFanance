/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.OrderDataDao;
import cn.kidjoker.core.model.OrderData;
import cn.kidjoker.core.service.OrderDataService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
@Service
public class OrderDataServiceImpl extends MybatisBaseServiceImpl<OrderData, String, OrderDataDao> implements OrderDataService {

	@Autowired
	private OrderDataDao baseDao;
	
	@Override
	public OrderDataDao getBaseDao() {
		return this.baseDao;
	}

}
