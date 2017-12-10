package cn.kidjoker.luckcoin.api.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/search")
public class SearchAction {
	
	@RequestMapping(value="/query")
	public void test() {
		System.out.println("123");
	}
}
