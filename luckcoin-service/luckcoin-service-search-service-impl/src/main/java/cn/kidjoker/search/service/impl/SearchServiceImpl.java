package cn.kidjoker.search.service.impl;

import org.springframework.stereotype.Service;

import cn.kidjoker.search.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Override
	public void showMessage() {
		System.out.println("123");
	}
	
}
