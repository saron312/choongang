package pg399;

public class Outter {
	public void method1(final int arg) {
		final int lacalVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + lacalVariable;
			}
		}
	}
}
