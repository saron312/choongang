package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class projectsr {
	private static Employees arr[] = new Employees[107];

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;

		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		stat = conn.createStatement();
		rs = stat.executeQuery("select employee_id, first_name||' '||last_name name, job_id, salary from employees"); // 고정형
		
		int i =0;
		while (rs.next()) {
				int employeeId = rs.getInt("employee_id");
				String name = rs.getString("name");
				String jobId = rs.getString("job_id");
				int salary = rs.getInt("salary");
				
				arr[i] = new Employees(employeeId, name, jobId, salary);
//				System.out.printf("%d %s %s %d\n", arr[i].getEmployeeId(), arr[i].getName(), arr[i].getJobId(), arr[i].getSalary());
				++i;
			}
	
			rs.close();
			stat.close();
			conn.close();
			
			System.out.println("-------------------------");
			System.out.println("     <<<사원 조회>>>");
			System.out.println("사원 번호를 입력하세요 (100~206)");
			System.out.println("-------------------------");
			System.out.print("사원 번호 입력>>");
			
			Scanner scan = new Scanner(System.in);
			int selectNum = scan.nextInt();
			Employees empl = findEmployee(selectNum);
			empl.print();
	}
	
	private static Employees findEmployee(int selectNum) {
		Employees empl = null;
		for(int i=0;i<arr.length;i++) {
			int employeeId = arr[i].getEmployeeId();
			if(employeeId == selectNum ) {
				empl = arr[i];
			}
		}
		return empl;
	}
}
