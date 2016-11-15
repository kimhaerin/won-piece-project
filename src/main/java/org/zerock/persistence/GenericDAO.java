package org.zerock.persistence;

import org.zerock.domain.SmemVO;

public interface GenericDAO<E, K> {
	
	public void create(E vo) throws Exception;

	public E read(K userid) throws Exception;

	public void update(E vo) throws Exception;

	public void delete(K userid) throws Exception;

}
