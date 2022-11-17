import java.util.Scanner;

public class FactoryExam2 {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("도형 선택>");
		String ss = scan.nextLine();
		Shape sh =  sf.getShape(ss);
		draw(sh);
		
//		Shape sh1 = sf.getShape("Circle");
//		//sh1.draw();
//		draw(sh1);
//		Shape sh2 = sf.getShape("Rect");
//		//sh1.draw();
//		draw(sh2);
		
	}
	
	public static void draw(Shape sh) {
		sh.draw();
	}

}
