import java.util.Scanner;

public class SaronEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է�>>");
		String name = scan.nextLine();
		System.out.print("�¾ �⵵ �Է�>>");
		int year = scan.nextInt();
		System.out.print("�¾ �� �Է�>>");
		int month = scan.nextInt();
		System.out.print("�¾ �� �Է�>>");
		int day = scan.nextInt();
		
		Saron sr = new Saron(name, year, month, day);
		sr.print();
	}
}
