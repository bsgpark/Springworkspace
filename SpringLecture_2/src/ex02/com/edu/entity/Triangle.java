package ex02.com.edu.entity;

public class Triangle extends Shape{
	

	public Triangle() {
		super();
	}
	

	public Triangle(String title, int data1, int data2) {
		super(title, data1, data2);
	}


	@Override
	public void viewSize() {
		System.out.println(title+"의 넓이 : " + (data1*data2/2));
	}

}
