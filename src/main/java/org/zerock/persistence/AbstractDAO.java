package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.TestVO;

public abstract class AbstractDAO<E, K> implements GenericDAO<E, K> {
	
	@Inject
	protected SqlSession sqlSession;
	
	protected String NAME;

	@Override
	public void create(E vo) throws Exception {
		
		sqlSession.insert(NAME + ".create", vo);

	}

	@Override
	public E read(K tno) throws Exception {
		return sqlSession.selectOne(NAME + ".read", tno);
		
	}

	@Override
	public void update(E vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(K tno) throws Exception {
		// TODO Auto-generated method stub

	}

}
