package com.akash.spring.springcore.sterotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	//@Value("#{100+10}")
	@Value("20")//value annotation always overide the value which is given at time of initializing the variable
	private int id=40;
	@Value("Akash")
	private String name="Taygi";
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}
	
	
	
}
