package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TimeDAOImpl {

	// 주입받음
	@Inject
	private SqlSession sqlSession;

	public String getTime() throws Exception {
		return sqlSession.selectOne("org.zerock.dao.TimeMapper.getTime");
	}
	
	

}
