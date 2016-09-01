package mvc.dao.impl;

import org.springframework.stereotype.Repository;

import mvc.dao.TestDao;

@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao{
	
	public TestDaoImpl(){
		System.out.println("TestDaoImpl 생성자!");
	}

	@Override
	public String addValue() {
		// TODO Auto-generated method stub
		System.out.println("This is TestDaoImpl");
		
		return null;
	}

}
