package interf;

public class RemoteControlExam {
	public static void main(String[] args) {
//		�������̽� ������ ���� ��ü ����
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}
}
