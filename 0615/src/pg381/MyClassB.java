package pg381;

public class MyClassB implements Myinterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}

	@Override
	public void method2() {
		Myinterface.super.method2();
		System.out.println("MyClassB-method2() 실행");
	}

}
