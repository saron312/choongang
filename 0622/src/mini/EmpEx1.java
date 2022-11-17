package mini;

import java.sql.SQLException;
import java.util.Scanner;

public class EmpEx1 {
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		EmpDao ed = new EmpDao();
		ed.connect();
		Scanner scan = new Scanner(System.in);
		
		//메뉴
		System.out.println("-------------------------------------------------------");
		System.out.println("                   <<사원목록 관리>>");
		System.out.println("1.사원목록 추가 | 2.사원정보 변경 | 3.사원목록 삭제  | 4. 사원목록 출력");
		System.out.println("-------------------------------------------------------");
		System.out.print("번호 입력>>");
		int num = scan.nextInt();
		switch(num) {
		case 1: //사원목록 추가
			System.out.println("추가할 사원의 정보를 입력하세요.");
			System.out.print("사번 입력>>");
			int inputEmpId = scan.nextInt();
			System.out.print("이름 입력>>");
			String name = scan.next();
			System.out.print("월급 입력>>");
			int salary = scan.nextInt();
			int result1 = ed.input(new Emp(inputEmpId,name,salary));
			System.out.println(result1+"건이 추가 되었습니다.");
			break;
			
		case 2: //사원정보 변경
			System.out.println("변경할 사원의 정보를 입력하세요.");
			System.out.print("변경할 사원의 사번 입력>>");
			int modifyEmdId = scan.nextInt();
			
			System.out.println("-----------------------------------------");
			System.out.println("<<변경할 사원의 정보>>");
			ed.printName(modifyEmdId).print();
			System.out.print("변경할 월급 입력>>");
			int modifySalary = scan.nextInt();
			int result2 = ed.modify(new Emp(modifyEmdId,modifySalary));
			System.out.println(result2+"건이 업데이트 되었습니다.");
			break;
			
		case 3: //사원목록 삭제
			System.out.println("삭제할 사원의 사번을 입력하세요.");
			System.out.print("사번 입력>>");
			int removeEmpId = scan.nextInt();
			int result3 = ed.remove(new Emp(removeEmpId));
			System.out.println(result3+"건이 삭제 되었습니다.");
			break;
			
		case 4: //사원목록 출력
			for(Emp emp:ed.lists()) {
				emp.print();
//				System.out.printf("사번: %d | 이름: %s | 월급: %d \n",emp.empId,emp.name,emp.salary);
			}
			break;
		}
	}
}
