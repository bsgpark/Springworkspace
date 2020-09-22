package ex02.com.edu.entity;

abstract public class Shape {
	public String title;
	public int data1,data2;
	public Shape() {
		super();
	}
	public Shape(String title, int data1, int data2) {
		super();
		this.title = title;
		this.data1 = data1;
		this.data2 = data2;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	public String getTitle() {
		return title;
	}
	abstract public void viewSize();

}
