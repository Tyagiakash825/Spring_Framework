package com.hibernate.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop=new Laptop();
		laptop.setLaptopId(101);
		laptop.setLaptopName("Dell");
		Student st=new Student();
		st.setId(1);
		st.setName("Akash Tyagi");
		st.setLaptop(laptop);
		
		SessionFactory sf=new Configuration().configure("com/hibernate/mapping/onetoone/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(st);
		s.save(laptop);
		
		s.getTransaction().commit();
		s.close();
	}

}
