package Mediator;

public class Exam {

	public static void main(String[] args) {
		User u1 = new User("ö��");
		User u2 = new User("����");
		u1.sendMsg("�ȳ�, ����!");
		u2.sendMsg("���� �� ����");
	}

}
