package lab3.ex1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3Client {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex1/beans-config.xml");
		// 請在下方寫作一段程式碼，取得DataSource的實體，
		// 並印出任意屬性值，以測試資料庫是否連通。
		//
	}

}
