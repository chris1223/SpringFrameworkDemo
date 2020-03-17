package lab2.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task4Client {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex1/beans-config.xml");
		ProductViewer viewer = (ProductViewer) context.getBean("viewer1");
		viewer.showProduct();
	}
}
