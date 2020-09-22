package anno03;
//기본 생성자 , 인자 3개 받는 인자
public class Emp {
	private String name;
	private int age;
	private double score;
	public Emp() {
		super();
	}
	
	public Emp(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "은 " + age + "세 이고 제 점수는 " + score + "입니다.";
	}
	

}
