
public class CalExam {

	public static void main(String[] args) {
		Calculator cal = new Plus(10,40);
		Calculator cal2 = new Minus(10,40);

		execute(cal);
		execute(cal2);
//		System.out.println(cal.execute());
//		System.out.println(cal2.execute());
	}
	
	public static void execute(Calculator cal) {
		System.out.println(cal.execute());
	}

}
