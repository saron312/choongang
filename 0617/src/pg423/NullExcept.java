package pg423;

public class NullExcept {
	public static void main(String[] args) {
		String ss = null;
		
		for(int i=0;i<10; i++) {
			try {
				System.out.println(ss.toString());
			}catch(NullPointerException ne) {
				System.out.println("널포인트 예외");
			}catch(Exception e) {
				e.printStackTrace();
			} //Exception과 NullPointerExceptio 순서를 바꾸면 에러가남 Exception에러 범위가 더 크기 때문
		}
		System.out.println("끝");
	}
}
