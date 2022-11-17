import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		stat = conn.createStatement();
		rs = stat.executeQuery("select first_name||' '||last_name as Name, job_id as Job, salary as Salary, 12*salary+100 as Incre_Ann_Salary, 12*(salary+100) as Incre_Salary from employees"); //°íÁ¤Çü
		while(rs.next()) {
			String name = rs.getString("Name");
			String job = rs.getString("job");
			int salary = rs.getInt("salary");
			int increAnnSalary = rs.getInt("Incre_Ann_Salary");
			int increSalary = rs.getInt("Incre_Salary");
			System.out.printf("%s: %s, %d, %d, %d\n",name,job,salary,increAnnSalary,increSalary);
		}
		rs.close();
		stat.close();
		conn.close();
	}
}
