package lab5.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab5/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product p = productDao.getProduct(1);

		p.setName("Hibernate test");

		p.setPrice(2);
		
		productDao.save(p);

	}

}
