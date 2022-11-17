package miniproject1;

import java.io.IOException;
import java.util.Scanner;

public class ReserveTime implements ReserveMovie {
	MovieChart mvChart[] = MovieChart.values();
	String addMenu[] = { "이전으로 돌아가기", "로그인으로 돌아가기", "종료" };
	Scanner scan = new Scanner(System.in);

	int randomHour = (int) (Math.random() * 3) + 8;
	int randomMin = (int) (Math.random() * 6) * 10;

	int selectTimeNum;
	ReserveTicket rt = new ReserveTicket();
	String[][] seat = new String[5][5];

	public void reserveTime() {
		System.out.println("------------------");
		System.out.println("<<예매 가능 시간>>");

		for (int i = 0; i < 3; i++) {
			if (i == 0 && randomHour < 10) {
				System.out.print((i + 1) + ".0" + randomHour + ":");
			} else {
				System.out.print((i + 1) + "." + (randomHour + (3 * i)) + ":");
			}
			if (randomMin == 0) {
				System.out.println(randomMin + "0");
			} else {
				System.out.println(randomMin);
			}
		}
		for (int i = 0; i < addMenu.length; i++) {
			System.out.println((i + 1 + mvChart.length) + "." + addMenu[i]);
		}

		System.out.print("입력>>");
		// 예매 날짜 선택
		selectTimeNum = scan.nextInt();
		switch (selectTimeNum) {
		case 1:
			rt.resetSeat();
			try {
				rt.reserveTicket();
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			reserveDate();
			break;
		case 5:
			logIn();
			break;
		case 6:
			close();
		default:
			System.out.println("------------------");
			System.out.println("없는 번호를 입력하셨습니다.");
			System.out.println("번호를 다시 입력 하세요.");
			// 번호 잘못 입력시 while문 다시 진행
		}
	}

	@Override
	public void logIn() {
		LogIn log = new LogIn();
		log.logIn();

	}

	@Override
	public void selectMovie() {
		
	}
	@Override
	public void reserveDate() {
		ReserveDate reDate = new ReserveDate();
		reDate.reserveDate();
	}

	@Override
	public void reserveTicket() throws InterruptedException, IOException {
		// ReserveTicket rt = new ReserveTicket();
		// rt.reserveTicket();
	}

	@Override
	public void cinemaCancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkSeat() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		Close clo = new Close();
		clo.close();

	}
}
