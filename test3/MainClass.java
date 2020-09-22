package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test3/bean.xml");
		MyCats myCat = factory.getBean("myCats", MyCats.class);
		myCat.CatNameInfo();
		myCat.CatAgeInfo();
		((ClassPathXmlApplicationContext)factory).close();
	}

}
