
public class test04_05 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�.");
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;

		double result2 = temp/10.0;
		
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result2 + "������ ���´�.");
		
		int a = 1;
		double b = 0.1;
		int c = 7 ;
		
		double re = a - c * b;
		System.out.println(re);
		
		
	}
}
