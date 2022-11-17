package strategy;

public class OpMulti implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public double doOperation(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
