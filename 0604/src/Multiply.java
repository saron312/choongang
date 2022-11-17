
public class Multiply implements Calculator {
	
	int x;
	int y;
	
	Multiply (int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int execute() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double executeD() {
		return x*y;
	}

}
