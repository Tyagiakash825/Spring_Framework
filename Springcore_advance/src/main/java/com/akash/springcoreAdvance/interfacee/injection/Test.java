package com.akash.springcoreAdvance.interfacee.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/springcoreAdvance/interfacee/injection/Config.xml");
		OrderDAOImp data=ctx.getBean(OrderDAOImp.class);
		System.out.println(data);
	}

}
