
public class CalExam2 {

	public static void main(String[] args) {
		CalFactory cf = new CalFactory();
		int x = 10;
		int y = 20;
		Calculator cal = cf.selectCal("+", x, y);
		System.out.println(cal.execute());
		cal = cf.selectCal("-", x, y);
		System.out.println(cal.execute());
		cal = cf.selectCal("/", x, y);
		System.out.println(cal.executeD());
		cal = cf.selectCal("*", x, y);
		System.out.println(cal.executeD());
	}

}
