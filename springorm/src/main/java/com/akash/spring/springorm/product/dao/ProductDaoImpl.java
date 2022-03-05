package com.akash.spring.springorm.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.akash.spring.springorm.product.entity.Products;

@Component
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Transactional
	@Override
	public int create(Products product) {
		int result=(int) hibernatetemplate.save(product);
		return result;
	}
	@Transactional
	@Override
	public int update(Products product) {
		hibernatetemplate.update(product);
		return 0;
	}
	@Override
	public Products find(int id) {
		Products product=hibernatetemplate.get(Products.class, id);
		return product;
	}
	@Override
	public List<Products> findall() {
		List<Products> products=hibernatetemplate.loadAll(Products.class);
		return products;
	}



}
