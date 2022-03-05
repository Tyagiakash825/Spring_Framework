package com.akash.spring.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoustmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/innerbean/innerbean_config.xml");
		Employee data=ctx.getBean(Employee.class);
		System.out.println(data);
	}

}
