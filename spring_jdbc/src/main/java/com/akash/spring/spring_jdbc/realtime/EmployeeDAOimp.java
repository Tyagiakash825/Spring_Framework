package com.akash.spring.spring_jdbc.realtime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOimp implements EmployeeDAO{

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	//@Autowired
	JdbcTemplate jdbc;
	@Override
	public int createEmployee(Employee em) {
		String query="insert into Employee values(?,?,?)";
		int result=jdbc.update(query,em.getId(),em.getFirstName(),em.getLastName());
		return result;
	}
	@Override
	public int updateEmployee(Employee em) {
		String query="update Employee set firstname=?,lastname=? where id=?";
		int result=jdbc.update(query,em.getFirstName(),em.getLastName(),em.getId());
		return result;
	}
	@Override
	public int deleteEmployee(int id) {
		String query="DELETE from Employee where id=?";
		int result=jdbc.update(query,id);
		return result;
	}
	@Override
	public Employee readEmployee(int id) {
		String query="select * from Employee where id=?";
		Rowmapper rowmapper=new Rowmapper();
		Employee emp=jdbc.queryForObject(query, rowmapper,id);
		return emp;
	}
	@Override
	public List<Employee> readallEmployee() {
		String query="select * from Employee";
		Rowmapper rowmapper=new Rowmapper();
		List<Employee> list=jdbc.query(query,rowmapper);
		return list;
	}

}
