package miniproject1;

import java.io.IOException;
import java.util.Scanner;

public class SelectMovie implements ReserveMovie {
	Scanner scan = new Scanner(System.in);
	MovieChart mvChart[] = MovieChart.values();
	String addMenu[] = { "�������� ���ư���", "�α������� ���ư���", "����" };
	int print = 

	public void selectMovie() {
		System.out.println("------------------");
		System.out.println("<<������Ʈ>>");
		// ��ȭ ��Ʈ ���
		for (int i = 0; i < mvChart.length; i++) {
			System.out.println((i + 1) + "." + mvChart[i]);
		}
		for (int i = 0; i < addMenu.length; i++) {
			System.out.println((i + 1 + mvChart.length) + "." + addMenu[i]);
		}
		System.out.print("�Է�>>");

		// ��ȭ ��ȣ ����
		int selectMvNum = scan.nextInt();
		
		switch (selectMvNum) {
		case 1:
			reserveDate(); // ���� ��¥�� �Ѿ
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
