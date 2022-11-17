package miniproject;

public class Employees {
	private int employeeId;
	private String name;
	private String jobId;
	private int salary;
	
	Employees(int employeeId,String name,String jobId, int salary){
		this.employeeId = employeeId;
		this.name = name;
		this.jobId = jobId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getJobId() {
		return jobId;
	}

	public int getSalary() {
		return salary;
	}
	
	public void print() {
		System.out.println("사원 번호:"+employeeId+" | 이름:"+ name+" | 부서:"+jobId+" | 월급:"+salary);
	}

	
}
