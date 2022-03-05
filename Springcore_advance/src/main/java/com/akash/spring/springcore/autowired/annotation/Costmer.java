package com.akash.spring.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Costmer {
	
	public Restaurants getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurants restaurants) {
		this.restaurants = restaurants;
	}
	@Override
	public String toString() {
		return "Costmer [restaurants=" + restaurants + "]";
	}
	@Autowired
	private Restaurants restaurants;
}
