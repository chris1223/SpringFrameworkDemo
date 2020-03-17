package lab3.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
	    // 在下面加入程式碼
	}

}
