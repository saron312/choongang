import java.util.Scanner;

public class Test05_01 {
	public static void main(String[] args) {
		int [] memo ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է�>>");
		int a = scan.nextInt();
		memo = new int[a];
		
		for(int i=0;i<memo.length;i++) {
			System.out.print("�Է�>>");
			int n = scan.nextInt();
			memo[i]=n;
		}
		
		printMemo(memo);
	}
	public static void printMemo(int[] mm) {
		for(int i=0;i<mm.length;i++) {
			System.out.print(mm[i]+" ");
		}
	}
}
