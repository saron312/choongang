package Bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int r, int x, int y) {
		System.out.println("초록 원: 반지름"+r+", 중심 ("+x+","+y+")");
	
		
	}

	@Override
	public void drawRect(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		
	}

}
