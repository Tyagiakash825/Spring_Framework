package com.akash.spring.Map;

import java.util.Map;

public class Coustmer {
	private String name;
	private Map<Integer,String> products;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Coustmer [name=" + name + ", products=" + products + "]";
	}
	
}
