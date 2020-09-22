package ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("ex01/bean.xml");
		Cats myCat = factory.getBean("myCats",Cats.class);
		myCat.getCatsInfo();
		
		((ClassPathXmlApplicationContext)factory).close();

		
	}
	
}
