
public class Student {
	//필드
	String name;
	static int kor;
	static int math;
	static int eng;
	Parents parents;
	
	//생성자
	Student(){}
	Student(int kor){
		this("테스트",0,0,0);
	}
	Student(String name){
		Student.aaa(); 
		this.name = name; //생성된 객체를 호출함..
	}
	private static void aaa() {
		// TODO Auto-generated method stub
		
	}
	Student(String name, int kor){
		this(name); // Student(String name) 호출
//		this.name=name;
		this.kor=kor;
	}
	Student(String name, int kor,int math){
		this(name,kor); //Student(String name, int kor) 호출
//		this.name=name;
//		this.kor=kor;
		this.math=math;
	}
	Student(String name, int kor, int math, int eng){
		this(name,kor,math);
//		this.name=name;
//		this.kor=kor;
//		this.math=math;
		this.eng=eng;
	} //생성자 오버로딩 //주로 쓸 것만 만든다.
	
	Student(String name, int kor, int math, int eng, Parents parents){
		this(name,kor,math,eng);
		this.parents = parents;
	}

//	//상단바 Source-Generate Constructor using Fields 클릭하여 생성할 것 체크하면.. 생성자가 생긴당
//	public Student(String name, int kor, int math, int eng) {
//		super();//부모의 생성자를 실행해라
//		this.name = name;
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;
//	}
	
	
	public static void sum2() {
		//System.out.println("총점: "+(kor+math+eng));
	}
	public void bbb() {}
	public void sum() {
		System.out.println("총점: "+(kor+math+eng));
	}

}
