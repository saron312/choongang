package test;

public class Test15 {

	public static void main(String[] args) {
//		while(true) {
//			
//		}//���ѷ���
		
		for(;;) {
			int nn = (int)(Math.random()*6)+1;
			System.out.println(nn);
			if(nn==5) {
				System.out.println("����Ż��");
				break; //���� Ż��
			}
		} 
	}
}
