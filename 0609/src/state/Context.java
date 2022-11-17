package state;

public class Context {
	private State st;
	
	public Context() {
		st = null;
	}

	public State getSt() {
		return st;
	}

	public void setSt(State st) {
		this.st = st;
	}
	
}
