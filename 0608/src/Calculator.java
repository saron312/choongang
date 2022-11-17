
public class Calculator {
	
	double avg(int x, int y) {
		return plus(x,y)/2;
	}
	
	void printPlus(int x,int y) {
		int z=x+y;
		System.out.println(z);
		//return;
	}
	int plus(int x,int y) {
		return x+y;
	}
	
	double plus(double x, double y) {
		return x+y;
	} //클래스 내에서 메소드 오버로딩
}
