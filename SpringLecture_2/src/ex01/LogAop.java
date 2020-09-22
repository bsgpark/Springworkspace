package ex01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("execution(public void getCatsInfo())")
	public void mywork() {
		
	}
	@Before("mywork()")
	public void before() {
		System.out.println("핵심 기능 전에 실할 공통 기능");
	}
	@After("mywork()")
	public void after() {
		System.out.println("핵심 기능 후에 실행 할 공통 기능");
	}

}
