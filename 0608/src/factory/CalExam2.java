package factory;

public class CalExam2 {
	public static void main(String[] args) {
		CalFactory cf = new CalFactory();
		cf.printResult("+", 34, 67);
		cf.printResult("-", 67, 34);
		cf.printResult("/", 67, 34);
		cf.printResult("*", 67, 34);
	}
}
