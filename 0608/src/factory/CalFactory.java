package factory;

public class CalFactory {
	void printResult(String op, int x, int y) {
		Calculator cal = null;
		if(op.equals("+")) {
			cal = new Plus();
		}else if(op.equals("-")) {
			cal = new Minus();
		}else if(op.equals("/")) {
			cal = new Divide();
		}else if(op.equals("*")) {
			cal = new Multiply();
		}
		cal.execute(x, y);
	}
}
