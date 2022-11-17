package pg460;

public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member("가나다");
		Member m2 = new Member("가나다");
		Member m3 = new Member("라마바");
//		if(m1 == m2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		if(m1.equals(m2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
