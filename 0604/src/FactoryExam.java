
public class FactoryExam {
	public static void main(String[] args) {
		Shape sh1 = new Circle();
		Shape sh2 = new Rectangle();
		//Circle sh3 = (Circle)new Shape(); //�������̽��� ��ü������ ����;
		//Circle sh3 = new Rectangle(); //�ȵ�...
		
		sh1.draw();
		sh2.draw();
	}
}
