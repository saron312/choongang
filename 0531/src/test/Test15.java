package test;

public class Test15 {

	public static void main(String[] args) {
//		while(true) {
//			
//		}//무한루프
		
		for(;;) {
			int nn = (int)(Math.random()*6)+1;
			System.out.println(nn);
			if(nn==5) {
				System.out.println("ㅋㅋ탈출");
				break; //루프 탈출
			}
		} 
	}
}
