package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample5 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test02/applicationContext.xml");
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		GoodsEntity entity=dao.findGoods(args[0]);
		
		if(entity != null) {
			System.out.println(entity.getCode()+"    " +entity.getName() +"   "
	                          + entity.getPrice() + "    " + entity.getMaker());
		}	
		((ClassPathXmlApplicationContext)factory).close();
	}

}
