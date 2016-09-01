package mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mvc.dao.TestDao;
import mvc.service.TestService;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

	@Autowired
	@Qualifier("testDaoImpl")
	private TestDao testDao;
	
	public TestServiceImpl(){
		System.out.println("TestServieImpl 생성자");
	}
	
	@Override
	public String addValue() {
		// TODO Auto-generated method stub
		System.out.println("This is TestServiceImpl");
		testDao.addValue();
		return null;
	}

}
