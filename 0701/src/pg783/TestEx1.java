package pg783;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestEx1 {
	public static void main(String[] args) {
		
		Student[] arr = new Student[] {
				new Student("È«±æµ¿",90),
				new Student("È«±æÃ¶",92),
				new Student("È«±æ¼ø",87)};
		
		List<Student> Is2 = new ArrayList<Student>();
		Is2.add(new Student("È«±æµ¿",90));
		Is2.add(new Student("È«±æÃ¶",92));
		Is2.add(new Student("È«±æ¼ø",87));
		
		
		List<Student> Is =Arrays.asList(
				new Student("È«±æµ¿",90),
				new Student("È«±æÃ¶",92),
				new Student("È«±æ¼ø",87));
		
		
//		Stream<Student> st =Is.stream();
		Stream<Student> st =Is2.stream(); 
		
		st.forEach(n->{
//			System.out.println(n.getName()+": "+n.getScore());
			System.out.println(n.toString());
		});
		
//		Iterator<String> it = Is.iterator();
//		while(it.hasNext()) {
//			String nn = it.next();
//			System.out.println(nn);
//		}
	}
}
