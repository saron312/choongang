package com;

public class B {
 A a; //A클래스 접근 가능 (필드로 선언 가능)
 
 	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열"); //컴파일 에러 private 생성자 접근 불가
	
//	public B() {
//		A a= new A();
//		a.field1 =1;
//		a.field2 =1;
//		a.field3 =1; // private 필드 접근 불가, 컴파일에러
//		
//		a.method1();
//		a.method2();
//		a.method3(); //private 메소드 접근 불가, 컴파일에러
//	}
}
