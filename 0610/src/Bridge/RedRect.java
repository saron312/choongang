package Bridge;

public class RedRect implements DrawAPI {

	@Override
	public void drawCircle(int r, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawRect(int x1, int y1, int x2, int y2) {
		System.out.println("»¡°£ »ç°¢Çü: ("+x1+","+y1+"),("+x2+","+y2+")");
	}
	

}
