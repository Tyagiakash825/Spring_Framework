package com.akash.spring.refType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoustmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/refType/Config.xml");
		Student data=ctx.getBean(Student.class);
		System.out.println(data);
	}

}
