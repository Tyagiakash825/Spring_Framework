package com.akash.spring.springcore.autowired.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/springcore/autowired/annotation/Config.xml");
		Costmer data=ctx.getBean(Costmer.class);
		System.out.println(data);
	}

}
