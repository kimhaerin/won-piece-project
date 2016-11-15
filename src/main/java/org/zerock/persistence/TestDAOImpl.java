package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public void create(TestVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public TestVO read(Integer tno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TestVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer tno) throws Exception {
		// TODO Auto-generated method stub

	}

}
