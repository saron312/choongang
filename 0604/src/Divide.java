
public class Divide implements Calculator{

	int x;
	int y;
	
	Divide(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int execute() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double executeD() {
		if(y==0) {
			return 0; //사실은 0으로 나누면 안됨, 일단 0으로 return하게 설정
		}
		return (double)x/y;
	}
	

}
