
public class CarExam {
	public static void main(String[] args) {
		
		//Car cc = new Car("����");  // ��ü(������Ʈ) ���� , ��ü�� ������ Ŭ���� �ȿ� ���ԵǾ���Ѵ�.
		Car cc = new Car();
		System.out.println(cc.aaa);
		cc.printAAA();
		cc.aaa="�ٶ�";
		cc.printAAA(); 
	}
}
