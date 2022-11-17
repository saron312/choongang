package factory;

public class Plus implements Calculator{
	
//	int x;
//	int y;
//	
//	Plus(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
	
	@Override
	public void execute(int x, int y) {
		System.out.println(x+y);
	}



}
