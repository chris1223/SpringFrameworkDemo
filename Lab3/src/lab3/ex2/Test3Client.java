package lab3.ex2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");

		//List<Product> list = productDao.getProducts();
		//for (Product p : list) {
		//	System.out.println(p);
		//}

		//Product p = productDao.getProduct(1);
		//System.out.println(p);

	}

}
