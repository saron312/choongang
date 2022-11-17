
public class CarExam {
	public static void main(String[] args) {
		
		//Car cc = new Car("마바");  // 객체(오브젝트) 생성 , 객체는 무조건 클래스 안에 포함되어야한다.
		Car cc = new Car();
		System.out.println(cc.aaa);
		cc.printAAA();
		cc.aaa="다라마";
		cc.printAAA(); 
	}
}
