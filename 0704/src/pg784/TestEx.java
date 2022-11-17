package pg784;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestEx {
	public static int sum;
	public static void main(String[] args) {
		List<Student> li = Arrays.asList(
				new Student("ȫ�浿",90),
				new Student("ȫ��ö",92),
				new Student("ȫ���",89)
				);
		Stream<Student> st = li.stream();
		st.forEach(s->sum += s.getScore());	
		System.out.println(sum);
		
		double avg = li.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg);
	}
}
