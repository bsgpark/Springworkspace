package test2;

public class SungJukDTO {
	private String name;
	private int kor, eng, mat;
	public SungJukDTO() {
		super();
	}
	public SungJukDTO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	

}