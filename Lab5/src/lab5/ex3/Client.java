package lab5.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab5/ex3/beans-config.xml");
		TxProductService txService = (TxProductService) context
				.getBean("txService");
		txService.testTx();

	}

}
