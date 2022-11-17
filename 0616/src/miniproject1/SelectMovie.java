package miniproject1;

import java.io.IOException;
import java.util.Scanner;

public class SelectMovie implements ReserveMovie {
	Scanner scan = new Scanner(System.in);
	MovieChart mvChart[] = MovieChart.values();
	String addMenu[] = { "이전으로 돌아가기", "로그인으로 돌아가기", "종료" };
	int print = 

	public void selectMovie() {
		System.out.println("------------------");
		System.out.println("<<무비차트>>");
		// 영화 차트 목록
		for (int i = 0; i < mvChart.length; i++) {
			System.out.println((i + 1) + "." + mvChart[i]);
		}
		for (int i = 0; i < addMenu.length; i++) {
			System.out.println((i + 1 + mvChart.length) + "." + addMenu[i]);
		}
		System.out.print("입력>>");

		// 영화 번호 선택
		int selectMvNum = scan.nextInt();
		
		switch (selectMvNum) {
		case 1:
			reserveDate(); // 예약 날짜로 넘어감
			break;
		case 2:
			reserveDate();
			break;
		case 3:
			reserveDate();
			break;
		case 4:
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
		}
	}

	@Override
	public void logIn() {
		LogIn log = new LogIn();
		log.logIn();

	}

	@Override
	public void reserveDate() {
		ReserveDate reDate = new ReserveDate();
		reDate.reserveDate();
	}

	@Override
	public void reserveTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reserveTicket() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
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
