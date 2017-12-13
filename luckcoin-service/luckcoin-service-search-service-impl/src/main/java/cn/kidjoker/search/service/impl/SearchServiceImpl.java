package cn.kidjoker.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kidjoker.common.service.impl.MybatisBaseServiceImpl;
import cn.kidjoker.search.dao.SearchDao;
import cn.kidjoker.search.model.SearchPO;
import cn.kidjoker.search.service.SearchService;

@Service
public class SearchServiceImpl extends MybatisBaseServiceImpl<SearchPO, Long, SearchDao> implements SearchService {
	
	@Autowired
	private SearchDao baseDao;
	
	@Override
	public SearchDao getBaseDao() {
		return this.baseDao;
	}
	
}
