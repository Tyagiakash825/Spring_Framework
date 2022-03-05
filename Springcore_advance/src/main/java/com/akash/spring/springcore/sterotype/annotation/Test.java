package com.akash.spring.springcore.sterotype.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/springcore/sterotype/annotation/Config.xml");
		Instructor data=ctx.getBean(Instructor.class);
		System.out.println(data.hashCode());
		System.out.println(data);
		Instructor data2=ctx.getBean(Instructor.class);
		System.out.println(data2.hashCode());
		System.out.println(data2);
	}
}
