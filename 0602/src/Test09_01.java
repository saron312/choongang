import java.util.Scanner;

public class Test09_01 {

	public static void main(String[] args) {
		String[] ani;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("동물의 수 입력>>");
		int aniInput = sc.nextInt();
		ani = new String[aniInput];
		
		for(int i=0; i<ani.length;i++) {
			System.out.print("동물 이름 입력>>");
			String aa = sc.next();
			ani[i] = aa;
		}
		for(int i=0; i<ani.length;i++) {
			System.out.print(ani[i]+" ");
		}System.out.println();
		
		System.out.print("검색할 동물 이름>>");
		String find = sc.next();
		for(int i=0;i<ani.length;i++) {			
			if(find.equals(ani[i])) {
				System.out.println("동물 "+find+"의 인덱스는 "+i);
			}
		}
	}

}
