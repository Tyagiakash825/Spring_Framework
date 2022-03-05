package com.akash.springcoreAdvance.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/springcoreAdvance/standalone/collections/Config.xml");
		Productlist data=ctx.getBean(Productlist.class);
		System.out.println(data);
	}

}
