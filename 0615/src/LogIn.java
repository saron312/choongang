//import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;

public class LogIn implements ReserveMovie {

	@Override
	public void logIn() {
		String id[] = { "sung", "jang", "jeong" };
		String password = "1234";
		Scanner sc = new Scanner(System.in);
		boolean loginOk = false;

		while (true) {
			System.out.println("------------------");
			System.out.print("���̵� �Է����ּ��� >>");
			String input_id = sc.nextLine();

			for (int i = 0; i < id.length; i++) {
				if (input_id.equals(id[i])) {
					loginOk = true;
					break;
				}
			}
			if (loginOk) {
				System.out.println("------------------");
				System.out.print("��й�ȣ�� �Է����ּ��� >>");

				while (true) {

					String input_pass = sc.next();
					if (input_pass.equals(password)) {

						System.out.println("�α��� �Ǿ����ϴ�.");
						selectMovie();
						break;

					} else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						System.out.print("��й�ȣ�� �Է����ּ��� >>");

					}
				}
			} else {
				System.out.print("���̵� Ʋ�Ƚ��ϴ�.");
				System.out.println();
				continue;

			}
			break;
		}
	}

	@Override
	public void selectMovie() {
		SelectMovie sm = new SelectMovie();
		sm.selectMovie();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[][] reserveTicket(String[][] seat) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancleTicket(String[][] seat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkSeat(String[][] seat) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	}









}