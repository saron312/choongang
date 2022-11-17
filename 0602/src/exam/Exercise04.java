package exam;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;
			System.out.println("("+x+","+y+")");
			if((x+y) == 5) {
				break;
			}
		}

	}
}
