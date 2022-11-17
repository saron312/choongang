package pg797;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortExam {
	public static void main(String[] args) {
		List<Student> stList = Arrays.asList(
				new Student("ȫ�浿",30),
				new Student("�ſ��",10),
				new Student("���̼�",20)
				);
		stList.stream().sorted().forEach(n->System.out.println(n.getScore()+""));
		System.out.println();
		
		IntStream intStream = Arrays.stream(new int[] {5,4,3,2,1,4});
		intStream.sorted().forEach(n->System.out.println(n));
	}
}
