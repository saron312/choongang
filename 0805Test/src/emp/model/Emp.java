package emp.model;

public class Emp {
	private int empId;
	private String empName;
	private String empAdd;
	private String empTel;
	private String empImg;
	private String empFile;
	
	public Emp() {}
	
	public Emp(int empId, String empName, String empAdd, String empTel, String empImg, String empFile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empTel = empTel;
		this.empImg = empImg;
		this.empFile = empFile;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public String getEmpTel() {
		return empTel;
	}
	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}
	public String getEmpImg() {
		return empImg;
	}
	public void setEmpImg(String empImg) {
		this.empImg = empImg;
	}
	public String getEmpFile() {
		return empFile;
	}
	public void setEmpFile(String empFile) {
		this.empFile = empFile;
	}
	
	public boolean hasEmpId() {
		return empId+"" != null && !(empId+"").isEmpty();
	}
}
