package com.oracle.test1;

import org.junit.Test;

import com.oracle.bean.User;
import com.oracle.dao.UserDao;

public class TestDao {
 
	@Test
	public void test(){
		
		UserDao dao=new UserDao();
		User user=new User();
		
		dao.save(user);
		
		
	}
	
}
