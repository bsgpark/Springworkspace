package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample1 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		FirstJdbcDao dao = factory.getBean("test", FirstJdbcDao.class);
		dao.execute("SELECT * FROM GOODSINFO");
		((ClassPathXmlApplicationContext)factory).close();
	}

}
