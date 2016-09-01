package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class TestController {
	
	public TestController(){
		System.out.println("TestController 생성");
	}
	
	@RequestMapping("add")
	public String addValue(){
		System.out.println("addValue method 소환!");
		
		return null;
	}
	
}
