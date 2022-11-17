
public class CalFactory {
	Calculator selectCal(String op, int x, int y) {
		if(op.equals("+")) {
			return new Plus(x,y);
		} else if(op.equals("-")) {
			return new Minus(x,y);
		} else if(op.equals("/")) {
			return new Divide(x,y);
		}else if(op.equals("*")) {
			return new Multiply(x,y);
		}
		return null;

	}
}
