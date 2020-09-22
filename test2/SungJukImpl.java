package test2;

import java.text.DecimalFormat;

public class SungJukImpl implements SungJuk {
	private SungJukDTO sungjukdto;

	public SungJukImpl(SungJukDTO sungjukdto) {
		super();
		this.sungjukdto = sungjukdto;
	}

	@Override
	public int getTot() {
		
		return sungjukdto.getEng() + sungjukdto.getKor() + sungjukdto.getMat();
	}

	@Override
	public double getAvg() {
		
		return (double)getTot() / 3;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \n"
				+sungjukdto.getName() + "\t"
				+sungjukdto.getKor() + "\t"
				+sungjukdto.getEng() + "\t"
				+sungjukdto.getMat() + "\t"
				+getTot() + "\t" + df.format(getAvg());
	}
	
	
	

}
