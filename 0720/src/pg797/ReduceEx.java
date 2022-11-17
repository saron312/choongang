package pg797;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {
	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("ȫ�浿",92),
				new Student("�ſ��",95),
				new Student("���ڹ�",88)
				);
//		int sum = stList.stream().mapToInt(Student::getScore).sum();
		
		int sum = stList.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		System.out.println(sum);
	}
}
