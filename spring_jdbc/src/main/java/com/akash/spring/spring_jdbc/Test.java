package com.akash.spring.spring_jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/spring_jdbc/config.xml");
		JdbcTemplate data=ctx.getBean(JdbcTemplate.class);
		String query="insert into Employee values(?,?,?)";
		int result=data.update(query, 1,"Akash","Tyagi");
		System.out.println(result);
	}

}
