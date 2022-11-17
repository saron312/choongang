
public class Saron {
	String name;
	int year;
	int month;
	int day;
	
	Saron(String name, int year, int month, int day){
		this.name = name;
		this.year = year;
		this.month=month;
		this.day=day;
	}
	
	void print() {
		System.out.println("이름 :"+name);
		System.out.println("생년월일 :"+year+"년 "+month+"월 "+day+"일");
	}

	
}
