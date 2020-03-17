package lab5.ex1;

import lab5.ex1.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab5/ex1/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
        // add your code here
		
	}

}
