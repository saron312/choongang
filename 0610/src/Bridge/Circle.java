package Bridge;

public class Circle extends Shape{
	private int x,y,r;
	protected Circle(int x, int y, int r,DrawAPI da) {
		super(da);
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	@Override
	public void draw() {
		da.drawCircle(r, x, y);
	}
}
