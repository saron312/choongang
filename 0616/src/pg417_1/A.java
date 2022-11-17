package pg417_1;

public class A {
	int y;
	class B {
		void method() {y=100;}
		}
	

	static class C {
		int x;
		void method() {}
	}

	void method() {
		A a = new A();
		A.B b = a.new B();
		A.C c = null;
		c.method();
	}
}
