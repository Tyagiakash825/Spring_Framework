package com.akash.spring.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setId(102);
		product.setName("Tyagi");
		SessionFactory sf=new Configuration().configure("com/akash/spring/Hibernate1/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		//s.save(product);
		 product= s.get(Product.class, 102);
		System.out.println(product);
		s.getTransaction().commit();
		s.close();
		
	}

}