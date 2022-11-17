package pg423;

public class ArrayIndecException {
	public static void main(String[] args) {
//		System.out.println(args[0]);
		int[] nn = {12,34,56};
		for(int i=0;i<5;i++) {
			try {
				System.out.println(nn[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ÀÎµ¦½º ¹üÀ§¸¦ ¹þ¾î³²");
//				e.printStackTrace();
			}
		}

	}
}
