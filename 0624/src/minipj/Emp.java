package minipj;

public class Emp {
	//�ʵ� ���� ����Ŭ ���̺� empinfo ���� ������ ���� : ���, �̸�, �Ի���, ����, �̸���)
	int empId;
	String name;
	String hireDate;
	String jobId;
	String email;
	
	//������ �����
	public Emp(int empId) {
		this.empId=empId;
	}
	public Emp(int empId, String name, String hireDate, String jobId, String email) {
		this.empId=empId;
		this.name=name;
		this.hireDate=hireDate;
		this.jobId=jobId;
		this.email=email;
	}
}
