package test0707;

public class Test04 {
	public static void main(String[] args) {
		//1���� 10������ �� ���ϱ� (for��)
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1���� 10������ �� ���ϱ� (while��)
		int sum2=0;
		int i=1;
		while(i<=10) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
	}
}
