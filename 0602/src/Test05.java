import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		String[] memo ; //String[] memo, String memo[] 둘 다 같음

		Scanner scan = new Scanner(System.in);
		
		System.out.print("줄수>>");
		int aa = scan.nextInt();
		memo = new String[aa];
		scan.nextLine();
		
		
		for(int i =0;i<memo.length;i++) {
			System.out.print("입력>>");
			String ss =scan.nextLine();
			memo[i]=ss;
		}
		printMemo(memo);
	}
	
	public static void printMemo(String[] ss) {
		for(int i= 0 ; i<ss.length; i++) {
			System.out.print(ss[i]+" ");
		}
	}
}
