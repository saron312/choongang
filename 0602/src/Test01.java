
public class Test01 {

	public static void main(String[] args) {
		int i =0;
		AAA: while(i<10) {
			int rr1 = (int)(Math.random()*6)+1;
			int rr2 = (int)(Math.random()*6)+1;
		//	System.out.println(i);
			switch(rr1+rr2) {
			case 7:
				System.out.println("½Â¸®!");
				break;
			case 2:
				System.out.println("Á¾·á!");
				break AAA;
			}
			i++;
		}
		
//		for(int i =0; i<10;i++) {
//			int rr1 = (int)(Math.random()*6)+1;
//			int rr2 = (int)(Math.random()*6)+1;
//			
//			switch(rr1+rr2) {
//			case 7:
//				System.out.println("½Â¸®!");
//				break;
//			default:
//				System.out.println("ÆÐ¹è!");
//			}
//		}
	}

}
