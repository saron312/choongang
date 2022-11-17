package state;

public class StartState implements State{

	@Override
	public void doAction(Context con) {
		System.out.println("플레이어 시작");
		con.setSt(this);
	}
	
	public String toString() {
		return "시작 상태";
	}

}
