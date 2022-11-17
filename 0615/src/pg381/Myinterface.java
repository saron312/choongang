package pg381;

public interface Myinterface {
	public void method1();
//	public void method2();
	public default void method2() {
		System.out.println("MyInterface-method2 ½ÇÇà");
		};
}
