package test;

import java.io.IOException;

public class Test13 {
	public static void main(String[] args) throws IOException {
		int k = 0;
		
		k = System.in.read();
		
		if (k==13 || k==10) {
			System.out.println("엔터");
		}
		if(k==49) {
			System.out.println("1입력");
		}
	}
}
