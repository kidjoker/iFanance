package cn.kidjoker.luckcoin.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kidjoker.search.service.SearchService;
import cn.kidjoker.search.service.impl.SearchServiceImpl;

@Controller
@RequestMapping(value="/search")
public class SearchAction {
	
	@Autowired
	private SearchService searchService;
	
	@ResponseBody
	@RequestMapping(value="/query")
	public void test() {
		searchService.showMessage();
	}
}
