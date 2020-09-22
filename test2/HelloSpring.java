package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test2/bean.xml");
		SungJuk bean;
		bean = (SungJuk)factory.getBean("sungjuk");
		System.out.println(bean.toString());
		
		
		
		((ClassPathXmlApplicationContext)factory).close();
		
	}

}
