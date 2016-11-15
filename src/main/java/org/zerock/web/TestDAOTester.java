package org.zerock.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.TestVO;
import org.zerock.persistence.TestDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })

public class TestDAOTester {
	
	@Autowired
	private TestDAO dao;
	
	@Test
	public void testDAO1(){
		System.out.println(dao);
	}
	
	@Test
	public void testInsert() throws Exception{
		
		TestVO vo = new TestVO();
		vo.setTname("yym");
		dao.create(vo);
		
	}

}
