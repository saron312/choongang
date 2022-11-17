package test;

public class Exam {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		System.out.println("----------------");
		//////////////////////////////
	
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수 
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		System.out.println("----------------");
		//////////////////////////////
		
		int value =356 ;
		int value2 = 874;
		int value3 = 438;
		System.out.println(value - (value%300));
		System.out.println(value2 - (value2%100));
		System.out.println((value3/100)*100);
		
		System.out.println("----------------");
		//////////////////////////////
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*height/2.0);
		System.out.println(area);
		
		System.out.println("----------------");
		//////////////////////////////
		
		int a = 10;
		int b = 5;
		
		System.out.println((a>7)&&(b<=5));
		System.out.println((a%3==2)&&(b%2 != 1));
		
		System.out.println("----------------");
		//////////////////////////////
		
		double d = 5.0;
		double e = 0.0;
		
		double f = d%e;
		
		if(Double.isNaN(f)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result2 = f+10;
			System.out.println("결과 : "+result2);
		}
		
		double d2 = 5.0;
		double e2 = 2.0;
		
		double f2 = d2%e2;
		
		if(Double.isNaN(f2)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result3 = f2+10;
			System.out.println("결과 : "+result3);
		}
		
	}
}
