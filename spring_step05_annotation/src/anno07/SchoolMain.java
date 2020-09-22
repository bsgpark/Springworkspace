package anno07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno07/bean.xml");

		School sh = (School) factory.getBean("mySchool");
		System.out.println(sh.toString());

		((ClassPathXmlApplicationContext) factory).close();

		/*
		 * 3학년 입니다
		 */

	}

}
