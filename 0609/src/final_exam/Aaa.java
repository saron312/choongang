package final_exam;

public class Aaa {
	static final int GGG;
	static {
		GGG = 9090;
	}
	
	static final int HHH=7878; //상수, 대문자로 표시 
	//final 필드
	final String ccc = "마지막";
	final String ddd; //초기값을 주던지, 생성자를 만들던지
	String nnn;
	
	Aaa(String ddd){
		this.ddd = ddd;
	}
	
}
