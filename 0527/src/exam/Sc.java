package exam;

import java.util.Scanner;

public class Sc {
	//�ʵ�
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
		 System.out.println("�̸��Է�>>");
		 Scanner sc = new Scanner(System.in);
		 name = sc.nextLine();
		 System.out.println("���� ���� �Է�>>");
		 sKor=sc.nextInt();
		 System.out.println("���� ���� �Է�>>");
		 sMath=sc.nextInt();
		 System.out.println("���� ���� �Է�>>");
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
