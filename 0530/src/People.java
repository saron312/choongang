
public class People {
	//부모 클래스
	public String name;
	public String ssn;
	
	//기본 생성자는 없고 name과 ssn을 매개값으로 받아 객체를 생성시키는 생성자만 있음,
	//따라서 People을 상속하는 Student클래스는 생성자에서super(name, ssn)으로 호출해야한다
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
