import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생 수 | 4.프로그램 종료");
			System.out.println("-------------------------");
			System.out.print("입력>");
			
			int Input = scan.nextInt();
			
			switch(Input) {
			case 1:
				System.out.print("학생 수 입력>");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
					
			}
		}
	}

}
