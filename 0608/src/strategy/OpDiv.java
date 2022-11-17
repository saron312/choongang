package strategy;

public class OpDiv implements Strategy {

	@Override
	public int doOperation (int num1, int num2) {
		return 0;
	}

	@Override
	public double doOperation(double num1, double num2) {
		return num1/num2;
	}

}
