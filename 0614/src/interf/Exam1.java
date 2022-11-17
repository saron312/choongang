package interf;

public class Exam1 {
	public static void main(String[] args) {
//		TestInter ti3 = new TestInter(); // 이거 안됨 -> 중괄호로 몸체를 만들어어ㅑ함
		
		TestInter ti2 = new TestInter() { // 익명 구현 객체

			@Override
			public boolean bbb() {
				// TODO Auto-generated method stub
				return false;
			}
			
		}; 
		
		TestInter ti = new TestInter() {

			@Override
			public boolean bbb() {
				// TODO Auto-generated method stub
				return false;
			} // 새로운 클래스를 형성하여 implements 하는 것과 똑같음
		};
	}
}
