package exam;

public class Exam03 {

	public static void main(String[] args) {
		//﻿ for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if((i%3)==0) {
				sum += i;
				//System.out.println("i : "+i+" | sum : "+sum);
			}			
		}
		System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합은 "+sum+"입니다.");
	}
}
