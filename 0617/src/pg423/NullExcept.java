package pg423;

public class NullExcept {
	public static void main(String[] args) {
		String ss = null;
		
		for(int i=0;i<10; i++) {
			try {
				System.out.println(ss.toString());
			}catch(NullPointerException ne) {
				System.out.println("������Ʈ ����");
			}catch(Exception e) {
				e.printStackTrace();
			} //Exception�� NullPointerExceptio ������ �ٲٸ� �������� Exception���� ������ �� ũ�� ����
		}
		System.out.println("��");
	}
}
