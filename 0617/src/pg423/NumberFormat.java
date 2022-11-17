package pg423;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args) {
		System.out.println("정수입력>>");
		Scanner scan = new Scanner(System.in);
		try {
			int nn = scan.nextInt();
			System.out.println(nn);
		}catch(InputMismatchException e) {
			System.out.println("다시입력");
		}

	}
}
