package pg783;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestEx2 {
	public static void prn(Student st) {
		System.out.println(st + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		List<Student> ls = Arrays.asList(
				new Student("ȫ�浿", 90),
				new Student("ȫ��ö", 92),
				new Student("ȫ���", 87));

//		Stream<Student> st =ls.stream();
		double dd = ls.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(dd);
		
//		Stream<Student> st = ls.stream();
//		Stream<Student> st = ls.parallelStream();
//		st.forEach(TestEx2::prn);
//		st.forEach(n->TestEx2.prn(n));
	}
}
