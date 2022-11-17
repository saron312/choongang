
public class CalExam {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.printPlus(10, 20);
		
//		int num = cal.plus(40, 50);
//		System.out.println(num);
		
		System.out.println(cal.plus(40, 50));
		System.out.println(cal.avg(60, 30));
	}
}
