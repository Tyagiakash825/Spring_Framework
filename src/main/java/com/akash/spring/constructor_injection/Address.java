package com.akash.spring.constructor_injection;

public class Address {
	private String name;
	private String depName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String name, String depName) {
		super();
		this.name = name;
		this.depName = depName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", depName=" + depName + "]";
	}
	
}
