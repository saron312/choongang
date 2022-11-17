
public class StEx {
	String name;
	int kor;
	int math;
	int eng;
	
	StEx(String name){
		this.name = name;
	}
	StEx(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	String result(){
		return "이름:"+name+" 국어:"+kor+"점, 수학:"+math+"점, 영어:"+eng+"점";
	}
	int sum(){
		return kor+math+eng;
	}
	
}
