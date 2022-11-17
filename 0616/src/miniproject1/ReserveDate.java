package miniproject1;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class ReserveDate implements ReserveMovie {
	MovieChart mvChart[] = MovieChart.values();
	String addMenu[] = { "�������� ���ư���", "�α������� ���ư���", "����" };
	Scanner scan = new Scanner(System.in);

	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH) + 1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK) - 1;
	String[] today = { "��", "��", "ȭ", "��", "��", "��", "��", "��", "��", "ȭ" };
	int selectDateNum;

	public void reserveDate() {
		System.out.println("------------------");
		System.out.println("<<���� ���� ��¥>>");
		// ���� ���� ��¥ ���
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "." + month + "�� " + (day + i) + "�� " + today[week + i]);
		}
		for (int i = 0; i < addMenu.length; i++) {
			System.out.println((i + 1 + mvChart.length) + "." + addMenu[i]);
		}
		System.out.print("�Է�>>");

		// ���� ��¥ ����
		selectDateNum = scan.nextInt();
		switch (selectDateNum) {
		case 1:
			reserveTime(); // ���� �ð� �޼ҵ�� �Ѿ
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
			System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
			System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
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
