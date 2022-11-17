import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Statement stat = null;
		String col1 = "ABC";
		int col2 = 200;
//		String sql = "insert into ex3_1(col1, col2, col3)" +
////					 "select job_id, salary, hire_date from employees";
//				     "values('"+col1+"',"+col2+",sysdate)";
		String sql = String.format("insert into ex3_1(col1, col2, col3)"
				                 + "values ('%s',%d, sysdate)",col1,col2);
		
//		System.out.println("insert into ex3_1(col1, col2, col3)"
//				                 + "values ('%s',%d, sysdate)");
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		stat = conn.createStatement();
		
		int ii = stat.executeUpdate(sql);
		System.out.printf("%d건을 처리했습니다.",ii);
		stat.close();
		conn.close();
				
	}
}
