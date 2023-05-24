package com.freshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {
	
//	the below annotation will tell the spring that listen the GET request on localhost("/")
//	the @RequestMapping will always have a method which will return a view, here rootView() will return an HTML file named index.html saved in resources.
	
	@GetMapping("/") @ResponseBody
	public String rootView() {
		return "index";
		
	}

}
