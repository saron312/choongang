
public class EnumExam1 {
	public enum 요일 {월,화,수,목,금,토,일} //한글이 되더라도 절대로 쓰지 말 것
	public static void main(String[] args) {
		System.out.println(Week.TUESDAY);
		System.out.println(요일.화);
		
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		
		int result1=day1.compareTo(day2); //day2를 기준으로 day1의 상대적 위치를 리턴
		int result2=day2.compareTo(day1); //day1을 기준으로 day2의 상대적 위치를 리턴
		System.out.println(day1.ordinal()); 
		System.out.println(day2.ordinal());
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay =Week.valueOf("SATURDAY");
		System.out.println(weekDay);
		
		Week[] days = Week.values();
		for(Week day:days) {
			System.out.print(day+"|");
		}
	}
}
