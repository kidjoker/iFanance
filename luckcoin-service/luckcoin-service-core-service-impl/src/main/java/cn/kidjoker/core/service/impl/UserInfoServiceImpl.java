/** work for life!
 * 
 */
package cn.kidjoker.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.core.dao.UserInfoDao;
import cn.kidjoker.core.model.UserInfo;
import cn.kidjoker.core.service.UserInfoService;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class UserInfoServiceImpl extends MybatisBaseServiceImpl<UserInfo, String, UserInfoDao> implements UserInfoService {

	@Autowired UserInfoDao baseDao;
	
	@Override
	public UserInfoDao getBaseDao() {
		return this.baseDao;
	}

}
