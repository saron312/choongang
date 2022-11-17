import java.util.Scanner;

public class Test04_01 {

	public static void main(String[] args) {
		int[] arr ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열의 길이>>");
		int aa = scan.nextInt();
		arr = new int[aa];
		
		for(int i=0;i<arr.length;i++) {			
			System.out.print("입력>>");
			int nn = scan.nextInt();
			arr[i] = nn;
		}
		printArr(arr);
		System.out.println(printSum(arr));
		System.out.println(printAvg(arr));
		
	}
	public static void printArr(int[] aar) {
		for(int i =0; i<aar.length;i++) {
			System.out.println("인덱스"+i+"의 값 : "+aar[i]);
		}
	}
	
	public static int printSum(int []sum) {
		int a=0;
		for(int i = 0;i<sum.length;i++) {
			a += sum[i];
		}
		return a;
	}
	public static double printAvg(int []avg) {
		return (double)printSum(avg)/avg.length;
	}

}
