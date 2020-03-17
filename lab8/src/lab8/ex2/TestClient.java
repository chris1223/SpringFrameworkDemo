package lab8.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext(
				"lab8/ex2/beans-config.xml");
		container.getBean("scheduler");
	}

}
