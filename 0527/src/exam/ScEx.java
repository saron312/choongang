package exam;

public class ScEx {
	public static void main(String[] args) {
		Sc a = new Sc();
		a.input();
		int sum = a.add();
		double avg = a.avg();
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		if(avg>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}

}
