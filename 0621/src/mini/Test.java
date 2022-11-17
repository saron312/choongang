package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;
		
		List<Employees> empList = new ArrayList<Employees>();
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		stat = conn.createStatement();
		rs = stat.executeQuery("select * from ex3_0621");
		int i = 0;
		
		while(rs.next()) {
			int empId = rs.getInt("emp_id");
			String name = rs.getString("emp_name");
			String email = rs.getString("emp_email");
			String jobId = rs.getString("emp_job_id");
			int salary = rs.getInt("emp_salary");
			int departId = rs.getInt("emp_department_id");
			
			empList.add(new Employees(empId,name,email,jobId,salary,departId));
			//자료 가져와서 객체에 넣기
			empList.get(i);
			System.out.println(empList.get(i));
			++i;
			}
		
		rs.close();
		stat.close();
		conn.close();
		
		for(Employees emp : empList) {
//			System.out.println(emp.getSalary());
			emp.print();
		}
		
		System.out.println("-------------------------");
		System.out.println("     <<<사원 조회>>>");
		System.out.println("사원 번호를 입력하세요 (100~206)");
		System.out.println("-------------------------");
		System.out.print("사원 번호 입력>>");
		
		Employees empl = new Employees();
		Scanner scan = new Scanner(System.in);
		int selectNum = scan.nextInt();
		
	}

}
