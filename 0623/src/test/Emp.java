package test;

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
	
//	public String print() {
//		return "���:"+empId+" | �̸�: "+name+" | ����:"+salary+"\n";
//	}
	
//	public int getempId() {
//		return empId;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getSalary() {
//		return salary;
//	}
	
	
}
