package com.akash.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/list/Config_list.xml");
		Hospital data=ctx.getBean(Hospital.class);
		System.out.println(data.getHospitalName());
		System.out.println(data.getDepatName());
	}

}
