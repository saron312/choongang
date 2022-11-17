package pg783;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class aaa {

	public static void main(String[] args) {

		List<Student> Is = Arrays.asList(new Student("全辨悼", 90), new Student("全辨枚", 92), new Student("全辨鉴", 87));

		Is.add(new Student("全dd", 85));

		Stream<Student> st = Is.stream();

		st.forEach(n -> {
			 System.out.println(n.getName()+": "+n.getScore());
//			 System.out.println(n.toString());
		});
	}

}
