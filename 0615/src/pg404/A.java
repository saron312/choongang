package pg404;

public class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		void parentMethod() {
			super.parentMethod();
		}
		
	};
	void method() {
		
		Parent localVar = new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		};
	}
	
	void method1(Parent parent) {}
	void method2() {
		method1(new Parent(){
			
			int childField;
			void childMethod() {}
			
			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		});
		
	}
}
