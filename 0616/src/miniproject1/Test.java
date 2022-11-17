package miniproject1;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		logIn();
		// ���ۺκ�
		boolean start = true;
		while (start) {
			// ó�� ȭ��
			System.out.println("------------------");
			System.out.println("1.�����ϱ�  | 2.���Ż��� Ȯ�� | 3.���� ��� | 4. �α������� ���ư��� | 5. ����");
			System.out.println("------------------");
			System.out.print("��ȣ �Է�>>");
			int selectStartMenu = scan.nextInt();
			ReserveTicket rt = new ReserveTicket();

			// ��ȣ ����
			switch (selectStartMenu) {
			case 1:
				SelectMovie selectMv = new SelectMovie();
				selectMv.selectMovie();
				break;
			case 2:
				try {
					rt.checkSeat();
				} catch (InterruptedException e) {
					System.out.println("�ٽ���");
				} catch (Exception e) {
					System.out.println("�ٽôٽ�");
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
				System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
			}
		}
		System.out.println("������");
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
