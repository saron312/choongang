package factory;

public class Divide implements Calculator {

	@Override
	public void execute(int x, int y) {
		System.out.println((double)x/y);
	}

}
