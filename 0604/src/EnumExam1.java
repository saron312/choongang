
public class EnumExam1 {
	public enum ���� {��,ȭ,��,��,��,��,��} //�ѱ��� �Ǵ��� ����� ���� �� ��
	public static void main(String[] args) {
		System.out.println(Week.TUESDAY);
		System.out.println(����.ȭ);
		
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		
		int result1=day1.compareTo(day2); //day2�� �������� day1�� ����� ��ġ�� ����
		int result2=day2.compareTo(day1); //day1�� �������� day2�� ����� ��ġ�� ����
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
