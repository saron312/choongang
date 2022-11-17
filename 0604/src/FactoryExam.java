
public class FactoryExam {
	public static void main(String[] args) {
		Shape sh1 = new Circle();
		Shape sh2 = new Rectangle();
		//Circle sh3 = (Circle)new Shape(); //인터페이스는 객체생성을 못함;
		//Circle sh3 = new Rectangle(); //안됨...
		
		sh1.draw();
		sh2.draw();
	}
}
