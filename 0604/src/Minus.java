import java.util.Scanner;

public class Minus implements Calculator {

	int x;
	int y;
	
	Scanner scan = new Scanner(System.in);
	Minus(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int execute() {
		return x-y;
	}

	@Override
	public double executeD() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
