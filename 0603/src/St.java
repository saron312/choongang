import java.util.Scanner;

public class St {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		StEx [] arr = null;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("====================");
			System.out.println("1.학생 수 | 2.점수 입력  | 3.점수 리스트 | 6.종료");
			System.out.println("====================");
			System.out.print("선택>>");
			int no = scan.nextInt();
			
			switch(no) {
			case 1: //학생 수 입력
				System.out.print("학생 수 입력>>");
				studentNum = scan.nextInt();
				arr = new StEx[studentNum];
				break;
			case 2:
				for(int i=0;i<studentNum;i++) {
					scan.nextLine();
					System.out.print(i+1 +"번 학생 이름 입력>>");
					String name=scan.nextLine();
					System.out.print("국어 점수 입력>>");
					int kor = scan.nextInt();
					System.out.print("수학 점수 입력>>");
					int math = scan.nextInt();
					System.out.print("영어 점수 입력>>");
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
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("보기에 없는 번호를 입력하였습니다.");
				System.out.println("번호를 다시 선택해주십시오");
				break;
			}
		}
	}

}
