package vending2;

public class VendingMachine2 {
	//public enum Products {COLOA, COFFEE, CIDER}
	private State state;
	private int coin;
	public VendingMachine2() {
		state = new NoCoinState();
	}
	public void insertCoin() {
		state.increaseCoin(this);
	}
	public void changeState(State newState) {
		this.state = newState;
	}
}
