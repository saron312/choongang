
public class Computer extends Calcul {
	//자식클래스
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	//부모 클래스의 areaCircle메소드가 재정의됨
	
}
