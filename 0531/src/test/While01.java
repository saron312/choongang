package test;

public class While01 {
	public static void main(String[] args) {
//		int i = 1;
//		while (i<=10) {
//			System.out.println(i);
//			i++;
//		}
		int sum = 0;
		int i = 1;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~"+(i-1)+"гу : "+sum);
	}
}
