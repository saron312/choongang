
public class Student {

	String name;
	int kor;
	int math;
	int eng;

	Student(String name) {
		this.name = name;
	}

	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}


	
	String content() {
		return "�̸�="+name +" / ����:"+kor+"��, ����:"+math+"��, ����"+eng+"��";
	}
	
	int sum() {
		return kor+math+eng;
	}
	double avg() {
		return (double)sum()/3.0;
	}
	
	String nn() {
		return name;
	}
}
