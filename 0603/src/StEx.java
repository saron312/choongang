
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
		return "�̸�:"+name+" ����:"+kor+"��, ����:"+math+"��, ����:"+eng+"��";
	}
	int sum(){
		return kor+math+eng;
	}
	
}
