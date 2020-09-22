package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int count=dao.insert("p0003", "스프링", 34000, "제이펌");
//		int count=dao.insert("p0004", "Ajax", 24000, "한빛출판사");
		System.out.println(count+"행 데이터가 입력 되었습니다.");
		((ClassPathXmlApplicationContext)factory).close();
	}

}
