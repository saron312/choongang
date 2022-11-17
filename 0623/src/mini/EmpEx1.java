package mini;

import java.sql.SQLException;
import java.util.Scanner;

public class EmpEx1 {
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		EmpDao ed = new EmpDao();
		ed.connect();
		Scanner scan = new Scanner(System.in);
		
		//�޴�
		System.out.println("-------------------------------------------------------");
		System.out.println("                   <<������ ����>>");
		System.out.println("1.������ �߰� | 2.������� ���� | 3.������ ����  | 4. ������ ���");
		System.out.println("-------------------------------------------------------");
		System.out.print("��ȣ �Է�>>");
		int num = scan.nextInt();
		switch(num) {
		case 1: //������ �߰�
			System.out.println("�߰��� ����� ������ �Է��ϼ���.");
			System.out.print("��� �Է�>>");
			int inputEmpId = scan.nextInt();
			System.out.print("�̸� �Է�>>");
			String name = scan.next();
			System.out.print("���� �Է�>>");
			int salary = scan.nextInt();
			int result1 = ed.input(new Emp(inputEmpId,name,salary));
			System.out.println(result1+"���� �߰� �Ǿ����ϴ�.");
			break;
			
		case 2: //������� ����
			System.out.println("������ ����� ������ �Է��ϼ���.");
			System.out.print("������ ����� ��� �Է�>>");
			int modifyEmdId = scan.nextInt();
			
			System.out.println("-----------------------------------------");
			System.out.println("<<������ ����� ����>>");
			ed.printName(modifyEmdId).print();
			System.out.print("������ ���� �Է�>>");
			int modifySalary = scan.nextInt();
			int result2 = ed.modify(new Emp(modifyEmdId,modifySalary));
			System.out.println(result2+"���� ������Ʈ �Ǿ����ϴ�.");
			break;
			
		case 3: //������ ����
			System.out.println("������ ����� ����� �Է��ϼ���.");
			System.out.print("��� �Է�>>");
			int removeEmpId = scan.nextInt();
			int result3 = ed.remove(new Emp(removeEmpId));
			System.out.println(result3+"���� ���� �Ǿ����ϴ�.");
			break;
			
		case 4: //������ ���
			for(Emp emp:ed.lists()) {
				emp.print();
//				System.out.printf("���: %d | �̸�: %s | ����: %d \n",emp.empId,emp.name,emp.salary);
			}
			break;
		}
	}
}
