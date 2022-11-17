package pg797;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortExam {
	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("홍길동",30),
				new Student("신용권",10),
				new Student("유미선",20)
				);
		stList.stream().sorted().forEach(n->System.out.println(n.getScore()+""));
		System.out.println();
		
		IntStream intStream = Arrays.stream(new int[] {5,4,3,2,1,4});
		intStream.sorted().forEach(n->System.out.println(n));
	}
}
