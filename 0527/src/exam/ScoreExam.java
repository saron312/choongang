package exam;

import java.util.Scanner;

public class ScoreExam {
 public static void main(String[] args) {
	 
	 System.out.print("이름입력>>");
	 Scanner sc = new Scanner(System.in);
	 String name = sc.nextLine();
	 System.out.print("국어 점수 입력>>");
	 int kor=sc.nextInt();
	 System.out.print("수학 점수 입력>>");
	 int math=sc.nextInt();
	 System.out.print("영어 점수 입력>>");
	 int eng=sc.nextInt(); 
	 System.out.println("---------");
	 
	 //객체 생성
	 Score a = new Score(name, kor, math, eng);

	 System.out.println("총점"+a.sum());
	 System.out.println("평균"+a.avg());
	 
	 System.out.println("---------");

	 double avg = a.avg();
	 if(avg >=60 && kor >=40 && math >=40 && eng>=40) {
		 System.out.println("합격");
	 }
	 if(avg<60) System.out.println("평균 60점 미달");
	 if(kor<40) System.out.println("국어 과락");
	 if(math<40) System.out.println("수학 과락");
	 if(eng<40) System.out.println("영어 과락");
	 if(avg<40) System.out.println("불합격");
 }
}
