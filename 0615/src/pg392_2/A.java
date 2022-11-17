package pg392_2;

public class A {
	class D{}
	static class C {
		C() {}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}

	void method() {
		class D {
			D() {}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
	}
}
