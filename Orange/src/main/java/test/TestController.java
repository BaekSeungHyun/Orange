package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.service.TestService;

@Controller
@RequestMapping("/test/*")
public class TestController {
	
	@Autowired
	@Qualifier("testServiceImpl")
	private TestService testService;
	
	public TestController(){
		System.out.println("TestController 생성");
	}
	
	@RequestMapping("add")
	public String addValue(){
		System.out.println("addValue method 소환!");
		testService.addValue();
		
		return null;
	}
	
}
