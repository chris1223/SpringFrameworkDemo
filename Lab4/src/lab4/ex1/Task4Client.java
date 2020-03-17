package lab4.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class Task4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab4/ex1/beans-config.xml");
		final ProductDao productDao = (ProductDao) context
				.getBean("productDao");
		// 在下面加入程式碼

	}

	private static void raiseException() {
		throw new RuntimeException();
	}

}
