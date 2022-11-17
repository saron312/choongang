package strategy;

public class Context {
	private Strategy st; 
	
	Context(Strategy st){
		this.st = st;
	}
	
	public int execute(int num1, int num2) {
		return st.doOperation(num1, num2);
	}
	
	public double execute(double num1, double num2) {
		return st.doOperation(num1, num2);
	}
}
