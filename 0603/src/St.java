import java.util.Scanner;

public class St {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		StEx [] arr = null;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("====================");
			System.out.println("1.�л� �� | 2.���� �Է�  | 3.���� ����Ʈ | 6.����");
			System.out.println("====================");
			System.out.print("����>>");
			int no = scan.nextInt();
			
			switch(no) {
			case 1: //�л� �� �Է�
				System.out.print("�л� �� �Է�>>");
				studentNum = scan.nextInt();
				arr = new StEx[studentNum];
				break;
			case 2:
				for(int i=0;i<studentNum;i++) {
					scan.nextLine();
					System.out.print(i+1 +"�� �л� �̸� �Է�>>");
					String name=scan.nextLine();
					System.out.print("���� ���� �Է�>>");
					int kor = scan.nextInt();
					System.out.print("���� ���� �Է�>>");
					int math = scan.nextInt();
					System.out.print("���� ���� �Է�>>");
					int eng = scan.nextInt();
					
					arr[i] = new StEx(name, kor, math, eng);
				}
				break;
			case 3:
				for(StEx i : arr) {
					System.out.println(i.result());
				}
				break;
			case 6:
				System.out.println("���α׷� ����");
				run = false;
				break;
			default:
				System.out.println("���⿡ ���� ��ȣ�� �Է��Ͽ����ϴ�.");
				System.out.println("��ȣ�� �ٽ� �������ֽʽÿ�");
				break;
			}
		}
	}

}
