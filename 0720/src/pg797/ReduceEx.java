package pg797;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {
	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("È«±æµ¿",92),
				new Student("½Å¿ë±Ç",95),
				new Student("±èÀÚ¹Ù",88)
				);
//		int sum = stList.stream().mapToInt(Student::getScore).sum();
		
		int sum = stList.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		System.out.println(sum);
	}
}
