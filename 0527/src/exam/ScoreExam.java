package exam;

import java.util.Scanner;

public class ScoreExam {
 public static void main(String[] args) {
	 
	 System.out.print("�̸��Է�>>");
	 Scanner sc = new Scanner(System.in);
	 String name = sc.nextLine();
	 System.out.print("���� ���� �Է�>>");
	 int kor=sc.nextInt();
	 System.out.print("���� ���� �Է�>>");
	 int math=sc.nextInt();
	 System.out.print("���� ���� �Է�>>");
	 int eng=sc.nextInt(); 
	 System.out.println("---------");
	 
	 //��ü ����
	 Score a = new Score(name, kor, math, eng);

	 System.out.println("����"+a.sum());
	 System.out.println("���"+a.avg());
	 
	 System.out.println("---------");

	 double avg = a.avg();
	 if(avg >=60 && kor >=40 && math >=40 && eng>=40) {
		 System.out.println("�հ�");
	 }
	 if(avg<60) System.out.println("��� 60�� �̴�");
	 if(kor<40) System.out.println("���� ����");
	 if(math<40) System.out.println("���� ����");
	 if(eng<40) System.out.println("���� ����");
	 if(avg<40) System.out.println("���հ�");
 }
}
