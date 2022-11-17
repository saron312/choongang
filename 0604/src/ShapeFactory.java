
public class ShapeFactory {
	public Shape getShape(String tt) {
		if(tt.equals("Circle")) {
			return new Circle();
		}else if(tt.equals("Rect")) {
			return new Rectangle();
		}else if(tt.equals("Square")) {
			return new Square();
		}
		return null;
	}
}
