package vcom.akash.spring.springcore.autowired.byName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoustmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("vcom/akash/spring/springcore/autowired/byName/scope_config.xml");
		Employee data=ctx.getBean(Employee.class);
		System.out.println(data);
	}

}
