package com.akash.springcoreAdvance.interfacee.injection;

public class OrderDAOImp implements OrderDAO {

	private OrderDAO dao;
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	@Override
	public void creatOrder() {
		System.out.println("Inside OrderDAO class");
		dao.creatOrder();

	}

}
