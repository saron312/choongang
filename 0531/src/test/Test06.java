package test;

public class Test06 {
	public static void main(String[] arg) {
		int s = 89;
		
		System.out.println((s>=90)?'A':'B');
		
		if(s>=90) {			
			System.out.println('A');
		}
		//if(s<90)
		else {
			System.out.println('B');			
		}
	}
}
