package org.zerock.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishHello implements Hello{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello world";
	}

}
