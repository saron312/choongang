package pg460;

public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member("������");
		Member m2 = new Member("������");
		Member m3 = new Member("�󸶹�");
//		if(m1 == m2) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ٸ���");
//		}
		if(m1.equals(m2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}

}
