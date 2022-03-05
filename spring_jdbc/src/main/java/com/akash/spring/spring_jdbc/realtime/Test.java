package com.akash.spring.spring_jdbc.realtime;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/spring/spring_jdbc/realtime/config.xml");
		EmployeeDAOimp data=ctx.getBean(EmployeeDAOimp.class);
		/*Employee emp=new Employee();
		emp.setId(2);
		emp.setFirstName("Aku");
		emp.setLastName("Tyagi");*/
		//System.out.println(data.createEmployee(emp));
		//System.out.println(data.updateEmployee(emp));
		//System.out.println(data.readEmployee(1));
		System.out.println(data.readallEmployee());
	}

}
