
public class Student extends People {
	//자식클래스 필드선언
	public int studentNo;
	
	//name, ssn, studentNo 를 매개값으로 받은 생성자. name, ssn은 부모 생성자를 호출함....
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //부모 생성자 호출
		this.studentNo = studentNo;
	}

}
