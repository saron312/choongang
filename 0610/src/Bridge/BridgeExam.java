package Bridge;

public class BridgeExam {
	
	public static void main(String[] args) {
		Shape sh = new Circle(100, 100, 10, new RedCircle());
		sh.draw();
		sh = new Circle(50,50,5, new GreenCircle());
		sh.draw();
		sh = new Rect(10,10,100,100,new RedRect());
		sh.draw();
		
	}
}
