package mini;

public class Emp {
	int empId;
	String name;
	int salary;
	
	Emp(){}

	
	Emp(int empId){
		this.empId=empId;
	}
	
	Emp(int empId,int salary){
		this.empId=empId;
		this.salary=salary;
	}
	
	Emp(int empId, String name, int salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void print() {
		System.out.printf("사번: %d | 이름: %s | 월급: %d \n",empId,name,salary);
	}
	
	public int getempId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	
}
