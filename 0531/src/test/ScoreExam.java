package test;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] ar) {
		System.out.print("이름입력>>");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("국어 점수 입력>>");
		int kor = sc.nextInt();
		System.out.print("수학 점수 입력>>");
		int math = sc.nextInt();
		System.out.print("영어 점수 입력>>");
		int eng = sc.nextInt();
		
		Score score = new Score(name, kor, math, eng);
		System.out.println("총점:"+score.sum());
		System.out.println("평균:"+score.avg());
		System.out.println("<<<결과>>>\n"+score.eval());
	}
}
