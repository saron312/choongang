import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		int[] score = new int[3];
		int[] score ;
		Scanner scan = new Scanner(System.in);

		System.out.println("Å©±â>>");
		int kk = scan.nextInt();
		score = new int[kk];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		
		for(int i=0; i<score.length;i++) {
			System.out.print("ÀÔ·Â>>");
			int nn = scan.nextInt();
			score[i] = nn;
		}
		print(score);
		System.out.println("ÃÑÇÕ : "+sum(score));
		System.out.println("Æò±Õ : "+avg(score));
	}
	
	public static void print(int[] sc) {
		
		for(int i =0;i<sc.length;i++) {
			System.out.println(sc[i]);
		}
	}
	
	public static int sum(int[] sum) {
		int add = 0;
		for(int i =0; i<sum.length; i++) {
			add += sum[i];
		}
		return add;
	}
	
	public static double avg(int[] aa){
		return (double)sum(aa)/aa.length;
		
	}
}
