package pg1042;

public class TestEx1 {

	public static void main(String[] args) {
		System.out.printf("%6d\n",123); //앞공백
		System.out.printf("%-6d\n",123); //뒤 공백
		System.out.printf("%06d\n",123);
		String ss = String.format("%06d\n",123);
		System.out.println(ss);
		System.out.println(Math.PI);
//		ss = String.format("%06d\n",Math.PI); //PI는 double형
		ss = String.format("%10.2f\n", Math.PI);
		System.out.println(ss);
	}

}
