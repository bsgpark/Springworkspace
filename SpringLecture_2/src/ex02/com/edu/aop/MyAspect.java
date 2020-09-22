package ex02.com.edu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	@Pointcut("execution(void viewSize())")
	public void mywork() {
		
	}
	@Before("mywork()")
	public void before() {
		System.out.println("도형의 넓이를 구한다");
	}
	@After("mywork()")
	public void after() {
		System.out.println("도형의 넒이를 출력한다");
	}

}
