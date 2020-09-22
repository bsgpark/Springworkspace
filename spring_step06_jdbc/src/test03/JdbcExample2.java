package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		GoodsEntity entity = new GoodsEntity();
		entity.setCode("p0010");
		entity.setName("HTML5");
		entity.setPrice(12000);
		entity.setMaker("공갈닷컴");
		
		
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int count = dao.insert(entity);
		System.out.println(count+"행 데이터가 입력 되었습니다.");
		((ClassPathXmlApplicationContext)factory).close();
	}

}
