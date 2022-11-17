import java.util.Scanner;

public class MovieEx {
	public static void main (String[] args) {
		int row = 0;
		int col = 0;
		int [][]arr = new int [5][5];
		boolean start = true;
		

		while(start) {
			
			System.out.println("-----------------------");
			System.out.println("1.좌석 선택 | 2.프로그램 종료");
			System.out.println("-----------------------");
			System.out.print("번호 입력>>");
	
			Scanner sc = new Scanner(System.in);
			int startNo = sc.nextInt();
			switch(startNo) {
			case 1:
				break;
			case 2:
				break;
			default:
				break;
			}
			
			System.out.print("행 입력>>");
			row = sc.nextInt();
			System.out.print("열 입력>>");
			col = sc.nextInt();
			
			arr[row][col] = 1;
			
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {

					if(arr[0][j]==j) {
						System.out.print("행 ");
					}else if(arr[i][0]==i) {
						System.out.print("열 ");
					}else if(arr[i][j]==0) {
						System.out.print("O ");
					}else if(arr[i][j]==1) {
						System.out.print("X ");
					}
				}
				System.out.println();
			}
			System.out.println(row+"행"+col+"열 완료");
			
			System.out.println("--------------------");
			System.out.println("1.추가 예매 | 3.예매 종료");
			System.out.println("--------------------");
			System.out.print("번호 입력>>");
			
			int Aaa = sc.nextInt();
			switch(Aaa) {
			case 1:
				break;
			case 3:
				start = false;
				System.out.println("예매 종료");
			}
		}

		
	}
}
