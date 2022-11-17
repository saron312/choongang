import java.util.ArrayList;

import pg660.Car;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // list.add(new Integer(100));
		list.add(200); // list.add(new Integer(200));
		list.add(300);
		
		Integer n =list.get(2); 
		System.out.println(list);
		
		ArrayList carList = new ArrayList();
		carList.add(new Car());
		Car car = (Car)carList.get(0);
	}
}
