package exam;

import java.util.Scanner;

public class SrEx {
	public static void main(String[] ar) {
		System.out.print("�̸��Է�>>");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("���� ���� �Է�>>");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		int math = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		int eng = sc.nextInt();
		
		SR sr = new SR(name, kor, math, eng);
		System.out.println("����:"+sr.sum());
		System.out.println("���:"+sr.avg());
		System.out.println("<<<���>>>\n"+sr.eval());
	}
}
