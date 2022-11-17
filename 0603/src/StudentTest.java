import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args0) {
		boolean run = true;
		int studentNum = 0;
		Student[] stu = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.�л� ��� | 2.��������Ʈ | 3.������ ��� | 4.�м� | 5.����");
			System.out.println("---------------------------");
			System.out.print("����>>");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("�л� �� >>");
				studentNum = sc.nextInt();
				stu = new Student[studentNum];
				
				for(int i=0; i<studentNum;i++) {
					sc.nextLine();
					System.out.print(i+1 +"�� �л��̸�>");
					String name = sc.nextLine();
					System.out.print("���� ����>");
					int kor = sc.nextInt();
					System.out.print("���� ����>");
					int math = sc.nextInt();
					System.out.print("���� ����>");
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
					System.out.println(st.nn()+"�� ����:"+st.sum()+", ���:"+st.avg());
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
				System.out.println("���� �ְ� ����: "+kmax+", ���: "+kavg);
				System.out.println("���� �ְ� ����: "+mmax+", ���: "+mavg);
				System.out.println("���� �ְ� ����: "+emax+", ���: "+eavg);
				System.out.println("��� ����:"+avg);
				break;
			case 5:
				run = false;
				System.out.println("���α׷� ����");
			default : 
				System.out.println("<<<<���� ��ȣ �Է���. �ٽ� �Է�>>>>");
			}
		}
	}
//	public static void prnStudent(Student st) {
//		System.out.println(st.name);
//	}
	
}
