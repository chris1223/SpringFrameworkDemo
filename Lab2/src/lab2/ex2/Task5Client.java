package lab2.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task5Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex2/beans-config.xml");
		Product product = (Product) context.getBean("product");
		System.out.println(product);
	}

}
