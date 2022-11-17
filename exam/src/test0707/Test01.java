package test0707;

public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int swap;
		
		System.out.println("데이터 교환 전 [a:"+a+", b:"+b+"]");
		
		swap = a;
		a = b;
		b = swap;
		
		System.out.println("데이터 교환 후 [a:"+a+", b:"+b+"]");
	}
}
