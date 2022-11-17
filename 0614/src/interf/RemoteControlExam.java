package interf;

public class RemoteControlExam {
	public static void main(String[] args) {
//		인터페이스 변수에 구현 객체 대입
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}
}
