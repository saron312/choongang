
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
		System.out.println("�̸� :"+name);
		System.out.println("������� :"+year+"�� "+month+"�� "+day+"��");
	}

	
}
