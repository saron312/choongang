package test;

public class Test05 {
	public static void main(String[] args) {
		// for (int i = 10; i > 0; i--) {
		// System.out.println(i);
		// }
		
		int sum = 0;
		for (int i = 0; i < 10; ++i) { //���Ϸ� �� ���� ++i, i++�� ���� ���
			sum = i;
			System.out.println(sum);
		}
		
		int sum2 = 0;
		for(int i =1 ; i<=10 ; ++i) {
			sum2 = sum2+i;
			//sum2 += i;
			//sum2 -= i;
			//sum2 *= i
			//sum2 /= i;
			//sum2 %= i;
			System.out.println(sum2);
		}
	}

}
