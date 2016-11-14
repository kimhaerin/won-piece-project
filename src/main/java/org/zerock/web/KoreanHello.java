package org.zerock.web;

import org.springframework.stereotype.Service;

@Service
public class KoreanHello implements Hello{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "안녕하세여";
	}
	
	
}
