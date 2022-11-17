package test0707;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bbb bus = new Bbb();
		Ccc taxi = new Ccc();

		driver.drive(bus);
		driver.drive(taxi);
	}
}
