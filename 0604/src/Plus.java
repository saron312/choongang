
public class Plus implements Calculator {

	int x;
	int y;
	
	Plus(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int execute() {
		return x+y;
	}
	@Override
	public double executeD() {
		// TODO Auto-generated method stub
		return 0;
	}

}
