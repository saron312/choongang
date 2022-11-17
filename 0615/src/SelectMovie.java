import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class SelectMovie implements ReserveMovie{
	MovieChart aa[] = MovieChart.values(); // 무비차트
	String bb[] = { "이전으로 돌아가기", "로그인으로 돌아가기", "종료" }; // 추가메늉
	int selectMvNum;
	int selectDateNum;
	int selectTimeNum;
	Scanner scan = new Scanner(System.in);
	
	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH) + 1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK) - 1;
	String[] today = { "일", "월", "화", "수", "목", "금", "토" };
	
	int randomHour = (int)(Math.random()*3)+8;
	int randomMin = (int)(Math.random()*6)*10;

	ReserveTicket rt = new ReserveTicket();
	String[][] seat = new String[5][5];
	
	// 시작부분
	public void selectStart() {
		boolean startMenu = true;
		while (startMenu) {
			// 처음 화면
			System.out.println("------------------");
			System.out.println("1.예매하기  | 2.예매상태 확인 | 3.예매 취소 | 4. 로그인으로 돌아가기 | 5. 종료");
			System.out.println("------------------");
			System.out.print("번호 입력>>");
			int selectStartMenu = scan.nextInt();

			// 번호 선택
			switch (selectStartMenu) {
			case 1:
				reserveMovie(); // 영화 선택 메소드
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
				System.out.println("없는 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력 하세요.");
				// 번호 잘못 입력시 while문 다시 진행
			}
		}
	}

	// 영화차트+선택
	void reserveMovie() {
		boolean startMovieMenu = true;

		while (startMovieMenu) {
			System.out.println("------------------");
			System.out.println("<<무비차트>>");
			// 영화 차트 목록
			
			for (int i = 0; i < aa.length; i++) {
				System.out.println((i + 1) + "." + aa[i]);
			}
			for (int i = 0; i < bb.length; i++) {
				System.out.println((i + 1 + aa.length) + "." + bb[i]);
			}
			System.out.print("입력>>");
			
			// 영화 번호 선택
			selectMvNum = scan.nextInt();
			switch (selectMvNum) {
			case 1:
				reserveDate(); //예약 날짜로 넘어감
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
				System.out.println("없는 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력 하세요.");
				// 번호 잘못 입력시 while문 다시 진행
			}
		}
	}

	// 예매 날짜+선택
	public void reserveDate() {

		boolean startDateMenu = true;
		while (startDateMenu) {
			System.out.println("------------------");
			System.out.println("<<예매 가능 날짜>>");
			System.out.println("<영화 :" + aa[selectMvNum - 1] + ">"); //선택한 영화
			//예매 가능 날짜 목록
			for (int i = 1; i <= 3; i++) {
				System.out.println(i + "." + month + "월 " + (day + i) + "일 " + today[week + i]);
			}
			for (int i = 0; i < bb.length; i++) {
				System.out.println((i + 1 + aa.length) + "." + bb[i]);
			}
			System.out.print("입력>>");
			
			
			//예매 날짜 선택
			selectDateNum = scan.nextInt();
			switch (selectDateNum) {
			case 1:
				reserveTime(); //예약 시간 메소드로 넘어감
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
				System.out.println("없는 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력 하세요.");
				// 번호 잘못 입력시 while문 다시 진행
			}
		}
	}
	
	public void reserveTime() {
		boolean startTimeMenu = true;
		while (startTimeMenu) {
			System.out.println("------------------");
			System.out.println("<<예매 가능 시간>>");
			System.out.print("<영화 : " + aa[selectMvNum - 1] + " - ");
			System.out.println(month + "월 " + (day+selectDateNum) + "일 " + today[week + selectDateNum]+">");
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
			
			System.out.print("입력>>");
			//예매 날짜 선택
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
				System.out.println("없는 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력 하세요.");
				// 번호 잘못 입력시 while문 다시 진행
			}
		}
	}
	
	public void print() {
		System.out.println("<<예매한 영화>>");
		System.out.print("<영화 : " + aa[selectMvNum - 1] + " - ");
		System.out.print(month + "월 " + (day+selectDateNum) + "일 " + today[week + selectDateNum]+"요일 - AM");
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