import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args0) {
		boolean run = true;
		int studentNum = 0;
		Student[] stu = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.학생 등록 | 2.점수리스트 | 3.총점과 평균 | 4.분석 | 5.종료");
			System.out.println("---------------------------");
			System.out.print("선택>>");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생 수 >>");
				studentNum = sc.nextInt();
				stu = new Student[studentNum];
				
				for(int i=0; i<studentNum;i++) {
					sc.nextLine();
					System.out.print(i+1 +"번 학생이름>");
					String name = sc.nextLine();
					System.out.print("국어 점수>");
					int kor = sc.nextInt();
					System.out.print("수학 점수>");
					int math = sc.nextInt();
					System.out.print("영어 점수>");
					int eng = sc.nextInt();
					
					stu[i] = new Student(name, kor, math, eng);
						
				}
				break;
			case 2:
				for(Student st:stu) {
					System.out.println(st.content());
				}
				break;
			case 3:
				for(Student st:stu) {
					System.out.println(st.nn()+"의 총점:"+st.sum()+", 평균:"+st.avg());
				}
				break;
			case 4:
				int kmax = 0;
				int mmax = 0;
				int emax = 0;
				int sum = 0;
				int ksum = 0;
				int msum = 0;
				int esum = 0;
				double kavg = 0;
				double mavg = 0;
				double eavg = 0;
				double avg = 0;
				for(Student st:stu) {
					kmax =(kmax<st.kor)? st.kor:kmax;
					mmax =(mmax<st.math)? st.math:mmax;
					emax =(emax<st.eng)? st.eng:emax;
					ksum += st.kor;
					msum += st.math;
					esum += st.eng;
					
					sum += st.sum();
					//System.out.println(sum);
				}
				kavg = (double)ksum/studentNum;
				mavg = (double)msum/studentNum;
				eavg = (double)esum/studentNum;
				avg = (double)sum/studentNum;
				System.out.println("국어 최고 점수: "+kmax+", 평균: "+kavg);
				System.out.println("수학 최고 점수: "+mmax+", 평균: "+mavg);
				System.out.println("영어 최고 점수: "+emax+", 평균: "+eavg);
				System.out.println("평균 점수:"+avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
			default : 
				System.out.println("<<<<없는 번호 입력함. 다시 입력>>>>");
			}
		}
	}
//	public static void prnStudent(Student st) {
//		System.out.println(st.name);
//	}
	
}
