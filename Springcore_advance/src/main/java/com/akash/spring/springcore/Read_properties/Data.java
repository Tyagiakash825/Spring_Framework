package com.akash.spring.springcore.Read_properties;

public class Data {
	private String dbServer;

	public Data(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Data [dbServer=" + dbServer + "]";
	}
	
}
