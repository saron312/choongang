package state;

public class StopState implements State{

	@Override
	public void doAction(Context con) {
		System.out.println("�÷��̾� ����");
		con.setSt(this);
	}
	
	public String toString() {
		return "���� ����";
	}

}
