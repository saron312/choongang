package test0707;

public class Test04 {
	public static void main(String[] args) {
		//1에서 10까지의 합 구하기 (for문)
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1에서 10까지의 합 구하기 (while문)
		int sum2=0;
		int i=1;
		while(i<=10) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
	}
}
