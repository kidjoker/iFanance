package cn.kidjoker.luckcoin.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kidjoker.search.model.SearchPO;
import cn.kidjoker.search.service.SearchService;

@Controller
@RequestMapping(value="/search")
public class SearchAction {
	
	@Autowired
	private SearchService searchService;
	
	@ResponseBody
	@RequestMapping(value="/query")
	public void test() {
		SearchPO unit = new SearchPO();
		unit.setVariable1("hahaha");
		unit.setVariable2("hehehe");
		unit.setVariable3("xixixix");
		searchService.add(unit);
		
		System.out.println("success");
	}
}
