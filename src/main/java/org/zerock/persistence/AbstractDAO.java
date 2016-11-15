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
	public E read(K userid) throws Exception {
		return sqlSession.selectOne(NAME + ".read", userid);
		
	}

	@Override
	public void update(E vo) throws Exception {
		sqlSession.selectOne(NAME + ".update", vo);

	}

	@Override
	public void delete(K userid) throws Exception {
		sqlSession.selectOne(NAME + ".delete", userid);

	}

}
