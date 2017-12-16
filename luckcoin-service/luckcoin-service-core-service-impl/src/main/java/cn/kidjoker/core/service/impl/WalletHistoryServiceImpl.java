/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.WalletDao;
import cn.kidjoker.core.dao.WalletHistoryDao;
import cn.kidjoker.core.model.WalletHistory;
import cn.kidjoker.core.service.WalletHistoryService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class WalletHistoryServiceImpl extends MybatisBaseServiceImpl<WalletHistory, String, WalletHistoryDao> implements WalletHistoryService {
	
	@Autowired
	private WalletHistoryDao baseDao;
	
	@Override
	public WalletHistoryDao getBaseDao() {
		return this.baseDao;
	}

}
