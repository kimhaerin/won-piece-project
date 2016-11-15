package org.zerock.persistence;

import org.zerock.domain.TestVO;

public interface TestDAO {

	public void create(TestVO vo) throws Exception;

	public TestVO read(Integer tno) throws Exception;

	public void update(TestVO vo) throws Exception;

	public void delete(Integer tno) throws Exception;

}
