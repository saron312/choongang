
public class StudentExam {

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		
//		stu[0].name="홍길동";
//		System.out.println(stu[0].name); //컴파일 에러남
		
		stu[0]=new Student("홍길동");
		System.out.println(stu[0].name);
	}

}
