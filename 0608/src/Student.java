
public class Student {
	//�ʵ�
	String name;
	static int kor;
	static int math;
	static int eng;
	Parents parents;
	
	//������
	Student(){}
	Student(int kor){
		this("�׽�Ʈ",0,0,0);
	}
	Student(String name){
		Student.aaa(); 
		this.name = name; //������ ��ü�� ȣ����..
	}
	private static void aaa() {
		// TODO Auto-generated method stub
		
	}
	Student(String name, int kor){
		this(name); // Student(String name) ȣ��
//		this.name=name;
		this.kor=kor;
	}
	Student(String name, int kor,int math){
		this(name,kor); //Student(String name, int kor) ȣ��
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
	} //������ �����ε� //�ַ� �� �͸� �����.
	
	Student(String name, int kor, int math, int eng, Parents parents){
		this(name,kor,math,eng);
		this.parents = parents;
	}

//	//��ܹ� Source-Generate Constructor using Fields Ŭ���Ͽ� ������ �� üũ�ϸ�.. �����ڰ� �����
//	public Student(String name, int kor, int math, int eng) {
//		super();//�θ��� �����ڸ� �����ض�
//		this.name = name;
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;
//	}
	
	
	public static void sum2() {
		//System.out.println("����: "+(kor+math+eng));
	}
	public void bbb() {}
	public void sum() {
		System.out.println("����: "+(kor+math+eng));
	}

}
