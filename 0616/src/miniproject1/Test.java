package miniproject1;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		logIn();
		// 시작부분
		boolean start = true;
		while (start) {
			// 처음 화면
			System.out.println("------------------");
			System.out.println("1.예매하기  | 2.예매상태 확인 | 3.예매 취소 | 4. 로그인으로 돌아가기 | 5. 종료");
			System.out.println("------------------");
			System.out.print("번호 입력>>");
			int selectStartMenu = scan.nextInt();
			ReserveTicket rt = new ReserveTicket();

			// 번호 선택
			switch (selectStartMenu) {
			case 1:
				SelectMovie selectMv = new SelectMovie();
				selectMv.selectMovie();
				break;
			case 2:
				try {
					rt.checkSeat();
				} catch (InterruptedException e) {
					System.out.println("다시해");
				} catch (Exception e) {
					System.out.println("다시다시");
				}
				break;
			case 3:
				rt.cinemaCancel();
				break;
			case 4:
				logIn();
				break;
			case 5:
				start = false;
				break;
			default:
				System.out.println("------------------");
				System.out.println("없는 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력 하세요.");
			}
		}
		System.out.println("종료함");
	}
	
	public static void logIn() {
		LogIn log = new LogIn();
		log.logIn();
	}

	public void reserveTicket() throws InterruptedException, IOException {
	}

	public void cinemaCancel() {
	}

	public void checkSeat() throws InterruptedException, IOException {
	}

}
