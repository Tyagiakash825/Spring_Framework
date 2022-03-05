package com.akash.spring.spring_jdbc.realtime;

import java.util.List;

public interface EmployeeDAO {

	public int createEmployee(Employee em);

	public int updateEmployee(Employee em);
	
	public int deleteEmployee(int id);
	
	public Employee readEmployee(int id);
	
	public List<Employee> readallEmployee();
}
