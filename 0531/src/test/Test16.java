package test;

public class Test16 {
	public static void main(String[] args) {
		AAA: for(;;) {

			for(;;) {
				int nn = (int)(Math.random()*6)+1;
				System.out.println(nn);
				if(nn==5) {
					break AAA ; //∑Á«¡ ≈ª√‚
				}
			}
		}
	}
}
