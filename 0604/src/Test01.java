import java.util.Scanner;

public class Test01 {

	public enum ���� {��,ȭ,��,��,��,��,��}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�>");
		String ss =scan.nextLine();
		Week tt = null;
		���� yy =null;

		
		switch(yy.valueOf(ss)) {
		case ��:
			System.out.println(Week.MONDAY);
			break;
		case ȭ:
			System.out.println(Week.TUESDAY);
			break;
		case ��:
			System.out.println(Week.WEDNESDAY);
			break;
		}
		
	}

}
