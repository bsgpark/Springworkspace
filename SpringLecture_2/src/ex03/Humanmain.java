package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Humanmain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("ex03/aopAppContext.xml");
		Human ob1= (Human)factory.getBean("per1");
		System.out.println(ob1.sayName("뽀로로"));
		Human ob2= (Human)factory.getBean("per2");
		System.out.println(ob2.sayName("둘리"));
		Human ob3= (Human)factory.getBean("per3");
		System.out.println(ob3.sayName("텔레토비"));

		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
