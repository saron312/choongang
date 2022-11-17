package test;

public class Test11 {
	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
		
//		int sum =0;
//		int j = 1;
//		for(; j<= 100;) {
//			sum += j++;
//			//System.out.println(j+":"+sum);
//			//j++;
//		}
//		System.out.println(sum);
//		//System.out.println(j); //101ÀÌ µÇ¾î ³ª¿È
		
		int sum =0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			//System.out.println(i+":"+sum);
			i++;
		}
		System.out.println(sum);
		//System.out.println(i); //101ÀÌ µÇ¾î ³ª¿È
	}
}
