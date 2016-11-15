package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.persistence.TimeDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBTester {

	// 주입 받을 떄마다 inject annotation을 선언
	@Inject
	private DataSource ds;
	@Inject
	private TimeDAOImpl dao;

	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());

	}

	@Test
	public void testDS() throws Exception {

		Connection con = ds.getConnection();
		System.out.println(con);
		con.close();
	}

	@Test
	public void testDBConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.0.34:3306/bit88?useSSL=false&serverTimezone=Asia/Seoul", "makemoney",
				"makemoney");

		System.out.println(con);
		con.close();

	}

}