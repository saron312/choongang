package state;

public class StartState implements State{

	@Override
	public void doAction(Context con) {
		System.out.println("�÷��̾� ����");
		con.setSt(this);
	}
	
	public String toString() {
		return "���� ����";
	}

}
