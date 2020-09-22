package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test1/bean.xml");
		Calc bean;
		bean = (Calc)factory.getBean("add");
		System.out.println(bean.toString());
		
		bean = factory.getBean("mul", Calc.class);
		System.out.println(bean.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
