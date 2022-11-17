package factory;

public class Minus implements Calculator {

//	int x;
//	int y;
//	
//	Minus(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
	
	@Override
	public void execute(int x, int y) {
		System.out.println(x-y);
	}



}
