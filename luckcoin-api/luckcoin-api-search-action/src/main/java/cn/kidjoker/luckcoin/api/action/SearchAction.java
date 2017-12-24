package cn.kidjoker.luckcoin.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/search")
public class SearchAction {
	
	@Autowired
	
	@ResponseBody
	@RequestMapping(value="/query")
	public void query() {
	}
}
