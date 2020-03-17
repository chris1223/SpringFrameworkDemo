package lab4.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class Task3Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab4/ex1/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		// Append your code here
		
		
	}

	private static void raiseException() {
		throw new RuntimeException();
	}

}
