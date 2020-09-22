package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample3 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int count=dao.delete(args[0]);  //이름으로 삭제
		System.out.println(args[0]+ "교재가 " + count +"권 삭제되었습니다");
		((ClassPathXmlApplicationContext)factory).close();
	}

}
