import java.util.Scanner;

public class Test05_02 {

	public static void main(String[] args) {
		int [] memo;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 입력>>");
		int lt = sc.nextInt();
		memo = new int[lt];
		
		for(int i=0; i<memo.length;i++) {
			System.out.print("숫자 입력>>");
			int ip=sc.nextInt();
			memo[i]= ip;
		}
		print(memo);
		System.out.println("총합: "+printSum(memo));
		System.out.println("평균: "+printAvg(memo));
	}
	
	public static void print(int[] mm) {
		for(int i=0; i<mm.length;i++) {
			System.out.println("인덱스"+i+"값 :"+mm[i]);
		}
	}
	
	public static int printSum(int[] aa) {
		int sum =0;
		for(int i=0;i<aa.length;i++) {
			sum += aa[i];
		} return sum;
	}

	public static double printAvg(int[] ab) {
		return (double)printSum(ab)/ab.length;
	}
}
