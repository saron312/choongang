package miniproject1;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class ReserveDate implements ReserveMovie {
	MovieChart mvChart[] = MovieChart.values();
	String addMenu[] = { "이전으로 돌아가기", "로그인으로 돌아가기", "종료" };
	Scanner scan = new Scanner(System.in);

	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH) + 1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK) - 1;
	String[] today = { "일", "월", "화", "수", "목", "금", "토", "일", "월", "화" };
	int selectDateNum;

	public void reserveDate() {
		System.out.println("------------------");
		System.out.println("<<예매 가능 날짜>>");
		// 예매 가능 날짜 목록
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "." + month + "월 " + (day + i) + "일 " + today[week + i]);
		}
		for (int i = 0; i < addMenu.length; i++) {
			System.out.println((i + 1 + mvChart.length) + "." + addMenu[i]);
		}
		System.out.print("입력>>");

		// 예매 날짜 선택
		selectDateNum = scan.nextInt();
		switch (selectDateNum) {
		case 1:
			reserveTime(); // 예약 시간 메소드로 넘어감
			break;
		case 2:
			reserveTime();
			break;
		case 3:
			reserveTime();
			break;
		case 4:
			selectMovie();
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
	public void selectMovie() {
		
	}
	
	@Override
	public void reserveTime() {
		ReserveTime reTime = new ReserveTime();
		reTime.reserveTime();

	}

	@Override
	public void reserveTicket() throws InterruptedException, IOException {
	}

	@Override
	public void cinemaCancel() {

	}

	@Override
	public void checkSeat() throws InterruptedException, IOException {

	}

	@Override
	public void close() {
		Close clo = new Close();
		clo.close();
	}

}
