import java.util.Scanner;

public class Test09_01 {

	public static void main(String[] args) {
		String[] ani;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �Է�>>");
		int aniInput = sc.nextInt();
		ani = new String[aniInput];
		
		for(int i=0; i<ani.length;i++) {
			System.out.print("���� �̸� �Է�>>");
			String aa = sc.next();
			ani[i] = aa;
		}
		for(int i=0; i<ani.length;i++) {
			System.out.print(ani[i]+" ");
		}System.out.println();
		
		System.out.print("�˻��� ���� �̸�>>");
		String find = sc.next();
		for(int i=0;i<ani.length;i++) {			
			if(find.equals(ani[i])) {
				System.out.println("���� "+find+"�� �ε����� "+i);
			}
		}
	}

}
