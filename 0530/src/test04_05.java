
public class test04_05 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;

		double result2 = temp/10.0;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result2 + "조각이 남는다.");
		
		int a = 1;
		double b = 0.1;
		int c = 7 ;
		
		double re = a - c * b;
		System.out.println(re);
		
		
	}
}
