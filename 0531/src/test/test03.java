package test;

public class test03 {
	public static void main(String[] args) {
		String ss1 = "������";
		String ss2="������";
		String ss3 = new String("������");
		
		System.out.println(ss1==ss2); //�ȿ� ������ ���ϴ� ���� �ƴ϶� �����ٰ� �����ִ� �ּҰ��� ���ϴ� ��
		System.out.println(ss1==ss3); //�ּҰ��� �ٸ��� ������ false�� ������ �� 
		System.out.println(ss1.equals(ss3)); //���� ��
	}
}
