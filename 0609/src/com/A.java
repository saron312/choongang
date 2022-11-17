package com;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {} //public 접근 제한
	A(int b) {} //default 접근 제한
	private A(String s) {} // private 접근제한
	
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자, 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
	public A() {
		field1=1;
		field2=1;
		field3=3;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
} 
