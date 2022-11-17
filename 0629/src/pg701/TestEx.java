package pg701;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestEx {

	static List<Student> Is = Arrays.asList(
			new Student("ȫ�浿","����",90),
			new Student("ȫ���","����",90),
			new Student("���浿","����",95),
			new Student("ȫ����"
					+ "","����",92)
			);
	public static double avg(Predicate<Student> pred){
		int co = 0 , sum = 0;
		for(Student stu : Is) {
			co++;
			sum += stu.getScore();
		}
		return(double)sum/co;
	}
	
	public static void main(String[] args) {
		double dd = avg(t->t.getSex().equals("����"));
		System.out.println("���� ���:"+dd);
	}

}
