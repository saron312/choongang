package state;

public class StopState implements State{

	@Override
	public void doAction(Context con) {
		System.out.println("플레이어 중지");
		con.setSt(this);
	}
	
	public String toString() {
		return "중지 상태";
	}

}
