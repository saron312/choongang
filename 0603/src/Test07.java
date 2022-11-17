
public class Test07 {

	public static void main(String[] args) {
		long n=4;
		long f=1;
		for(long i=1; i<=n;i++) {
			f=f*i;
			// f = 1*1
			// f = 1*2
			// f = 2*3
			// f = ((1*2)*3)*4
		}
		System.out.println(n+"!="+f);
		System.out.println(4+"!="+fact(4));
	}
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return fact(n-1)*n; //Àç±Í È£Ãâ (recursive)
		}
	}
}
