
public class CalculExam {
	public static void main(String[] args) {
		Calcul myCal = new Calcul();
		
		//정사각형 넓이 구하기
		double result1 = myCal.areaRect(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCal.areaRect(10,20);
		
		System.out.println("정사각형의 넓이: "+result1);
		System.out.println(myCal.areaRect(10));
		System.out.println("직사각형의 넓이: "+result2);
		System.out.println(myCal.areaRect(20,20));
	}
}
