package ex03;

public class Person3 implements Human{

	@Override
	public String sayName(String name) {
		System.out.println("나의 이름은 " + name + "입니다");
		return "나는 가수 name 입니다\n " ;
	}

}
