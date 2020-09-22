package test1;

public class CalcAdd implements Calc {
	public int a,b;
	
	

	public CalcAdd(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



	@Override
	public int calculate() {
		
		// TODO Auto-generated method stub
		return a+b;
	}



	@Override
	public String toString() {
		return a + "+" + b + "=" + calculate();
		
	}
	

}
