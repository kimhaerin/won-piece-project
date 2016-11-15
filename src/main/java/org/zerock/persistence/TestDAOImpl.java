package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.TestVO;

@Repository
public class TestDAOImpl extends AbstractDAO<TestVO, Integer> implements TestDAO {

	public TestDAOImpl(){
		this.NAME = "org.zerock.dao.TestMapper";
	}

}
