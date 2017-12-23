/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.WalletDao;
import cn.kidjoker.core.model.Wallet;
import cn.kidjoker.core.service.WalletService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
@Service
public class WalletServiceImpl extends MybatisBaseServiceImpl<Wallet, String, WalletDao> implements WalletService {
	
	@Autowired
	private WalletDao baseDao;
	
	@Override
	public WalletDao getBaseDao() {
		return this.baseDao;
	}

}
