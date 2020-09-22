package ex03;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {
	@Pointcut("execution(* * .sayName(..))")
	public void mywork() {
		
	}
	
	@Before("mywork()")
	public void beforeSaying() {
		System.out.println("당신의 이름은 무엇입니까?");
	}
	@After("mywork()")
	public void aftersaying(){
		System.out.println("이름이 멋지시네요");
	}
	@AfterReturning("mywork()")
	public void afterReturnSaying() {
		System.out.println("직업이 무엇입니까?");
		
	}

}
