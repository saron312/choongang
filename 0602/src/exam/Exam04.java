package exam;

public class Exam04 {
	public static void main(String[] arg) {
		//﻿while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2)형태로 출력하고,
		//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		//눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2) 입니다.
		
//		while(true) {
//			
//		}//1. 일단 while의 무한루프를 만들기.
		
//		while(true) {
//			int x = (int)(Math.random()*6)+1;
//			int y = (int)(Math.random()*6)+1;
//			System.out.println("("+x+","+y+")");
//		}//2. 랜덤 주사위값 계속 돌리기. 무한루프

		
		while(true) {
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;
			
			if((x+y) != 5) {
				System.out.println("("+x+","+y+")");
			}else {
				System.out.println("("+x+","+y+")");
				System.out.println("눈1="+x+" | 눈2="+y+"\n합이 "+(x+y)+"가 되어 종료함");
				break;
			}
		}
	}
}
