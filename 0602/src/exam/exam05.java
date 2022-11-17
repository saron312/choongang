package exam;

public class exam05 {
	public static void main(String[] args) {
		//﻿중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x , y)형태로 출력해보세요. 
		//단, x와 y는 10이하의 자연수입니다.
//		for(int x=1;x<=10;x++) {
//			for(int y=1;y<=10;y++) {
//				System.out.println("("+x+","+y+")");
//			}
//		}
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
