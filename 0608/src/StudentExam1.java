
public class StudentExam1 {
	public static void main(String[] args) {
		Student.sum2();
		Parents parents = new Parents();
		Student st = new Student("È«±æµ¿",90,90,100,parents);
		System.out.println(st.kor+","+st.math+","+st.eng);
		st.sum();
		Student st2 = new Student("°¨»ç¶û",70,90,70,parents);
		System.out.println(st2.kor+","+st2.math+","+st2.eng);
		st2.sum();
		//Student.kor = 40;
		int test = st.kor + st2.kor;
		System.out.println(test);
		System.out.println(Student.kor);
	}
}
