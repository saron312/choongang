
public class Test02 {

	int x;
	int y;
	
	public static void aaa(int x1, int y1) {
		System.out.println(x1+y1);		
	}
	
	public static void main(String[] args) {
		aaa(20,30);
		Test02.aaa(10,30);
	}

}
