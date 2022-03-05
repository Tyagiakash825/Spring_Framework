package com.akash.spring.list;

import java.util.List;

public class Hospital {
	private String hospitalName;
	private List<String> depatName;
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public List<String> getDepatName() {
		return depatName;
	}
	public void setDepatName(List<String> depatName) {
		this.depatName = depatName;
	}
	
}
