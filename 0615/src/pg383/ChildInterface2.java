package pg383;

public interface ChildInterface2 extends ParentInterface{

	@Override
	default void method1() {
		
	}

	@Override
	default void method2() {
		ParentInterface.super.method2();
	}
	
	public void method3();

}
