package Bridge;

public class Rect extends Shape {
	private int x1, y1, x2, y2;

	protected Rect(int x1,int y1,int x2,int y2, DrawAPI da) {
		super(da);
		this.x1=x1;
		this.y2=y2;
		this.x2=x2;
		this.y2=y2;
				
	}

	@Override
	public void draw() {
		da.drawRect(x1, y1, x2, y2);
	}

}
