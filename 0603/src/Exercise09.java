import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.�л� �� | 4.���α׷� ����");
			System.out.println("-------------------------");
			System.out.print("�Է�>");
			
			int Input = scan.nextInt();
			
			switch(Input) {
			case 1:
				System.out.print("�л� �� �Է�>");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				break;
			case 4:
				System.out.println("���α׷� ����");
				run = false;
				break;
					
			}
		}
	}

}
