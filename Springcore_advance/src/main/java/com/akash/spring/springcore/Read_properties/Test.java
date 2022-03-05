package com.akash.spring.springcore.Read_properties;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/springcore/Read_properties/scope_config.xml");
		Data data=ctx.getBean(Data.class);
		System.out.println(data);
	}
}
