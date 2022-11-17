import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class SelectMovie implements ReserveMovie{
	MovieChart aa[] = MovieChart.values(); // ������Ʈ
	String bb[] = { "�������� ���ư���", "�α������� ���ư���", "����" }; // �߰��޴�
	int selectMvNum;
	int selectDateNum;
	int selectTimeNum;
	Scanner scan = new Scanner(System.in);
	
	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH) + 1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK) - 1;
	String[] today = { "��", "��", "ȭ", "��", "��", "��", "��" };
	
	int randomHour = (int)(Math.random()*3)+8;
	int randomMin = (int)(Math.random()*6)*10;

	ReserveTicket rt = new ReserveTicket();
	String[][] seat = new String[5][5];
	
	// ���ۺκ�
	public void selectStart() {
		boolean startMenu = true;
		while (startMenu) {
			// ó�� ȭ��
			System.out.println("------------------");
			System.out.println("1.�����ϱ�  | 2.���Ż��� Ȯ�� | 3.���� ��� | 4. �α������� ���ư��� | 5. ����");
			System.out.println("------------------");
			System.out.print("��ȣ �Է�>>");
			int selectStartMenu = scan.nextInt();

			// ��ȣ ����
			switch (selectStartMenu) {
			case 1:
				reserveMovie(); // ��ȭ ���� �޼ҵ�
				break;
			case 2:
				print();
				break;
			case 3:
				break;
			case 4:
				logIn();
				break;
			case 5:
				close();
				startMenu = false;
			default:
				System.out.println("------------------");
				System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
				// ��ȣ �߸� �Է½� while�� �ٽ� ����
			}
		}
	}

	// ��ȭ��Ʈ+����
	void reserveMovie() {
		boolean startMovieMenu = true;

		while (startMovieMenu) {
			System.out.println("------------------");
			System.out.println("<<������Ʈ>>");
			// ��ȭ ��Ʈ ���
			
			for (int i = 0; i < aa.length; i++) {
				System.out.println((i + 1) + "." + aa[i]);
			}
			for (int i = 0; i < bb.length; i++) {
				System.out.println((i + 1 + aa.length) + "." + bb[i]);
			}
			System.out.print("�Է�>>");
			
			// ��ȭ ��ȣ ����
			selectMvNum = scan.nextInt();
			switch (selectMvNum) {
			case 1:
				reserveDate(); //���� ��¥�� �Ѿ
				break;
			case 2:
				reserveDate();
				break;
			case 3:
				reserveDate();
				break;
			case 4:
				selectStart();
				break;
			case 5:
				logIn();
				selectStart();
				startMovieMenu = false;
				break;
			case 6:
				close();
			default:
				System.out.println("------------------");
				System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
				// ��ȣ �߸� �Է½� while�� �ٽ� ����
			}
		}
	}

	// ���� ��¥+����
	public void reserveDate() {

		boolean startDateMenu = true;
		while (startDateMenu) {
			System.out.println("------------------");
			System.out.println("<<���� ���� ��¥>>");
			System.out.println("<��ȭ :" + aa[selectMvNum - 1] + ">"); //������ ��ȭ
			//���� ���� ��¥ ���
			for (int i = 1; i <= 3; i++) {
				System.out.println(i + "." + month + "�� " + (day + i) + "�� " + today[week + i]);
			}
			for (int i = 0; i < bb.length; i++) {
				System.out.println((i + 1 + aa.length) + "." + bb[i]);
			}
			System.out.print("�Է�>>");
			
			
			//���� ��¥ ����
			selectDateNum = scan.nextInt();
			switch (selectDateNum) {
			case 1:
				reserveTime(); //���� �ð� �޼ҵ�� �Ѿ
				break;
			case 2:
				reserveTime();
				break;
			case 3:
				reserveTime();
				break;
			case 4:
				reserveMovie();
				break;
			case 5:
				logIn();
				selectStart();
				reserveMovie();
				startDateMenu = false;
				break;
			case 6:
				close();
			default:
				System.out.println("------------------");
				System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
				// ��ȣ �߸� �Է½� while�� �ٽ� ����
			}
		}
	}
	
	public void reserveTime() {
		boolean startTimeMenu = true;
		while (startTimeMenu) {
			System.out.println("------------------");
			System.out.println("<<���� ���� �ð�>>");
			System.out.print("<��ȭ : " + aa[selectMvNum - 1] + " - ");
			System.out.println(month + "�� " + (day+selectDateNum) + "�� " + today[week + selectDateNum]+">");
			for(int i=0;i<3;i++) {
				if(i==0 && randomHour <10) {
					System.out.print((i+1)+".0"+randomHour+":");
				} else {
					System.out.print((i+1)+"."+(randomHour+(3*i))+":");
				}
				if(randomMin == 0) {
					System.out.println(randomMin+"0");
				}else {
					System.out.println(randomMin);
				}
			}
			for (int i = 0; i < bb.length; i++) {
				System.out.println((i + 1 + aa.length) + "." + bb[i]);
			}
			
			System.out.print("�Է�>>");
			//���� ��¥ ����
			selectTimeNum = scan.nextInt();
			switch (selectTimeNum) {
			case 1:
				print();
				startTimeMenu = false;
				rt.resetSeat(seat);
//				rt.reserveTicket(seat);
				System.out.println("***"+seat[1][1]);		
				break;
			case 2:
				startTimeMenu = false;
				print();
				break;
			case 3:
				startTimeMenu = false;
				print();
				break;
			case 4:
				reserveDate();
				break;
			case 5:
				logIn();
				selectStart();
				reserveMovie();
				reserveDate();
				startTimeMenu = false;
				break;
			case 6:
				close();
			default:
				System.out.println("------------------");
				System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("��ȣ�� �ٽ� �Է� �ϼ���.");
				// ��ȣ �߸� �Է½� while�� �ٽ� ����
			}
		}
	}
	
	public void print() {
		System.out.println("<<������ ��ȭ>>");
		System.out.print("<��ȭ : " + aa[selectMvNum - 1] + " - ");
		System.out.print(month + "�� " + (day+selectDateNum) + "�� " + today[week + selectDateNum]+"���� - AM");
			if((selectTimeNum-1)==0 && randomHour <10) {
				System.out.print("0"+randomHour+":");
			} else {
				System.out.print((randomHour+(3*(selectTimeNum-1)))+":");
			}
			if(randomMin == 0) {
				System.out.println(randomMin+"0>");
			}else {
				System.out.println(randomMin+">");
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
	public void close() {
		Close clo = new Close();
		clo.close();
		
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