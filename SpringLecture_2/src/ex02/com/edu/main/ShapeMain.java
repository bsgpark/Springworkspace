package ex02.com.edu.main;


import ex02.com.edu.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("ex02/bean.xml");
		Shape ss1=(Shape)factory.getBean("rect");
		ss1.viewSize();
		Shape sh2=(Shape)factory.getBean("tri");
		sh2.viewSize();
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
