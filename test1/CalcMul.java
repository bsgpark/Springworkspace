package test1;

public class CalcMul implements Calc{
	public int a,b;
	
	

	public void setA(int a) {
		this.a = a;
	}



	public void setB(int b) {
		this.b = b;
	}



	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a*b;
	}



	@Override
	public String toString() {
		return a + "*" + b + "=" + calculate();
	}
	

}
