package org.zerock.persistence;

import org.zerock.domain.TestVO;

public interface GenericDAO<E, K> {
	
	public void create(E vo) throws Exception;

	public E read(K tno) throws Exception;

	public void update(E vo) throws Exception;

	public void delete(K tno) throws Exception;

}