package interf;

public class CarExam2 {
	
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
	
	
}
