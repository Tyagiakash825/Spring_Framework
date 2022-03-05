package com.akash.spring.springorm.product.dao;

import java.util.List;

import com.akash.spring.springorm.product.entity.Products;

public interface ProductDao {
	int create(Products product);
	int update(Products product);
	Products find(int id);
	List<Products> findall();
}
