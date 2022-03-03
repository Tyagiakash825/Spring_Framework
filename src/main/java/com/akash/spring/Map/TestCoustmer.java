package com.akash.spring.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoustmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/Map/Config_Map.xml");
		Coustmer data=ctx.getBean(Coustmer.class);
		System.out.println(data);
	}

}
