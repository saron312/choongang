package interf;

public class Exam1 {
	public static void main(String[] args) {
//		TestInter ti3 = new TestInter(); // �̰� �ȵ� -> �߰�ȣ�� ��ü�� ���������
		
		TestInter ti2 = new TestInter() { // �͸� ���� ��ü

			@Override
			public boolean bbb() {
				// TODO Auto-generated method stub
				return false;
			}
			
		}; 
		
		TestInter ti = new TestInter() {

			@Override
			public boolean bbb() {
				// TODO Auto-generated method stub
				return false;
			} // ���ο� Ŭ������ �����Ͽ� implements �ϴ� �Ͱ� �Ȱ���
		};
	}
}
