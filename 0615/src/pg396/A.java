package pg396;

public class A {
	B field1 = new B();
	C field2 = new C();
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	class B{}
	static class C{}
}
