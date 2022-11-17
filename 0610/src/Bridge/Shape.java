package Bridge;

public abstract class Shape {
	protected DrawAPI da;
	protected Shape(DrawAPI da) {
		this.da = da;
	}
	
	public abstract void draw();
}
