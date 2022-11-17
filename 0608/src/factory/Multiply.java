package factory;

public class Multiply implements Calculator {

	@Override
	public void execute(int x, int y) {
		System.out.println(x*y);
	}
	
}
