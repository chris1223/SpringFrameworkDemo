package lab7.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessageProvider {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab7/ex4/beans-config.xml");
		JmsTemplate jmst = (JmsTemplate) context.getBean("jmst");
		jmst.convertAndSend("Hello World!");
	}

}
