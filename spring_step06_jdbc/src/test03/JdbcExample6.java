package test03;
/*  수정
[문제] p0001을  jQuery, 35000, 인포믹스로 변경하시오

[결과] 상품 1개를 수정하였습니다
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		GoodsEntity entity=new GoodsEntity();
		entity.setCode("p0001");
		entity.setName("제이쿼리");
		entity.setPrice(30000);
		entity.setMaker("한빛미디어");
		
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int n=dao.update(entity);
		
		if(n>0) {
			System.out.println("상품 " + n + "개를 수정하였습니다");
		}
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
