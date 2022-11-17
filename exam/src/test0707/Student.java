package test0707;

public class Student {
	int hakbun;
	String name;
	int kor;
	int mat;
	int eng;
	
	public Student(int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}

	public Student(int hakbun, String name, int kor, int mat, int eng) {
		this(hakbun, name);
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	public int sum() {
		return kor+mat+eng;
	}
	
	public double avg() {
		return (double)sum()/3.0;
	}
}
