
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
			return 0; //����� 0���� ������ �ȵ�, �ϴ� 0���� return�ϰ� ����
		}
		return (double)x/y;
	}
	

}
