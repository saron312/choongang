package test;

public class test03 {
	public static void main(String[] args) {
		String ss1 = "가나다";
		String ss2="가나다";
		String ss3 = new String("가나다");
		
		System.out.println(ss1==ss2); //안에 내용을 비교하는 것이 아니라 가나다가 써져있는 주소값을 비교하는 것
		System.out.println(ss1==ss3); //주소값이 다르기 때문에 false가 나오는 것 
		System.out.println(ss1.equals(ss3)); //내용 비교
	}
}
