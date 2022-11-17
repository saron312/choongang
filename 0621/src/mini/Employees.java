package mini;

public class Employees {
	private int empId;
	private String name;
	private String email;
//	private String hireDate;
	private String jobId;
	private int salary;
	private int departId;
	
	Employees(){}
	
	Employees(int empId, String name, String email, String jobId, int salary, int departId){
		this.empId = empId;
		this.name = name;
		this.email = email;
//		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.departId = departId;
	}
	

	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
//	
//	public String hireDate() {
//		return hireDate;
//	}
	
	public String getJobId() {
		return jobId;
	}

	public int getSalary() {
		return salary;
	}

	public int getDepartId() {
		return departId;
	}
	
	public void print() {
		System.out.printf("사번: %d | 이름: %s | e-mail: %s | Job_Id: %s | 월급: %d | 부서번호: %d \n",
				           empId,name,email,jobId,salary,departId);
	}
	
	public void delete(int removeIndex) {
		
	}
	
}
