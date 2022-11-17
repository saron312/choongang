
public class Test02 {
	public static void main(String[] args) {
		for(int i =1; i<=10 ; i++) {
			//for(int j = 0; j<i; j++) {
			for(int j = 10; j >= i; j--) {
				//System.out.println(j+","+i);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
