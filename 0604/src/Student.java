
public class Student {
	//필드
	private String name;
	private int no; //번호
	
	
	Student(){}
	Student(String name){ //생성자
		//this.name = name;
		this(name,999);
	}
	
	Student(String name, int no){
		//this(name);
		this.name = name;
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return this.name;
	}

	
}
