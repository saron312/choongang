package exam;

import java.util.Scanner;

public class Sc {
	//필드
	String name;
	int sKor;
	int sMath;
	int sEng;

	Sc(){
		
	}
	Sc(int kor, int math, int eng) {
		sKor=kor;
		sMath=math;
		sEng=eng;
	}
	
	void input() {
		 System.out.println("이름입력>>");
		 Scanner sc = new Scanner(System.in);
		 name = sc.nextLine();
		 System.out.println("국어 점수 입력>>");
		 sKor=sc.nextInt();
		 System.out.println("수학 점수 입력>>");
		 sMath=sc.nextInt();
		 System.out.println("영어 점수 입력>>");
		 sEng=sc.nextInt(); 
		 System.out.println("---------");
	}
	
	int add() {
		int result = sKor+sMath+sEng;
		return result;
	}
	
	double avg() {
		double result = (double)(sKor+sMath+sEng)/3.0;
		return result;
	}
	
	void aa (int kor, int math, int eng) {
		
	}

	
}
