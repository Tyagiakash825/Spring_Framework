package com.akash.spring.springorm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akash.spring.springorm.product.dao.ProductDao;
import com.akash.spring.springorm.product.entity.Products;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/akash/spring/springorm/Config.xml");
		ProductDao data = ctx.getBean(ProductDao.class);
		/*Products product=new Products();
		product.setId(101);
		product.setName("HP");
		product.setPrice(29000);*/
		//product.setDes("For personal Use only");
		//System.out.println(data.create(product));
		//System.out.println(data.update(product));
		//System.out.println(data.find(101));
		System.out.println(data.findall());
		
	}

}
