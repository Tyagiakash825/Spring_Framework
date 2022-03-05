package com.akash.springcoreAdvance.standalone.collections;

import java.util.List;

public class Productlist {
	List<String> list;

	@Override
	public String toString() {
		return "Productlist [list=" + list + "]";
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
