import java.util.Scanner;

public class Test01 {

	public enum 요일 {월,화,수,목,금,토,일}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("요일 입력>");
		String ss =scan.nextLine();
		Week tt = null;
		요일 yy =null;

		
		switch(yy.valueOf(ss)) {
		case 월:
			System.out.println(Week.MONDAY);
			break;
		case 화:
			System.out.println(Week.TUESDAY);
			break;
		case 수:
			System.out.println(Week.WEDNESDAY);
			break;
		}
		
	}

}
