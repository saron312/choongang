
public class Fact {
	public static void main(String[] args) {
		int n = 10;
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		System.out.println(n+"! = "+fact);
		System.out.println("재귀호출을 이용한 "+n+"! = "+fact(n));
	}
	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return fact(n-1)*n ;
		}
	}
}
