
public class Student extends People {
	//�ڽ�Ŭ���� �ʵ弱��
	public int studentNo;
	
	//name, ssn, studentNo �� �Ű������� ���� ������. name, ssn�� �θ� �����ڸ� ȣ����....
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //�θ� ������ ȣ��
		this.studentNo = studentNo;
	}

}
