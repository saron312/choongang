import java.util.Scanner;

public class SaronEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력>>");
		String name = scan.nextLine();
		System.out.print("태어난 년도 입력>>");
		int year = scan.nextInt();
		System.out.print("태어난 월 입력>>");
		int month = scan.nextInt();
		System.out.print("태어난 일 입력>>");
		int day = scan.nextInt();
		
		Saron sr = new Saron(name, year, month, day);
		sr.print();
	}
}
