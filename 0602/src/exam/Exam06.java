package exam;

public class Exam06 {
	public static void main(String[] args) {
		//6.for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요. (별찍기)
//		for(int i=0 ;i<10;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0 ;i<10;i++) {
//			for(int j=10;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0 ;i<10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
//				for(int a=0;a<x;a++) {
					System.out.print("*");
//				}
				
			}
			System.out.println();
		}
		for(int a=1 ;a<10;a++) {
			for(int b=1;b<a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
