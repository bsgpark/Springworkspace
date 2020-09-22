package test03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample4 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao = factory.getBean("test", FirstJdbcDao.class);
		List<GoodsEntity> list = dao.listGoods();
		
		for(GoodsEntity ob :list) {
			System.out.print("코드" + ob.getCode()+ "\t");
			System.out.print("책이름" + ob.getName()+ "\t");
			System.out.print("가격" + ob.getPrice()+ "\t");
			System.out.println("출판사" + ob.getMaker()+ "\t");
		}
		
		((ClassPathXmlApplicationContext)factory).close();
				
	}

}
