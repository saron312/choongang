import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		String sql = "select employee_id, first_name, salary, to_char(hire_date, 'YY/MM')" + 
				     "  from employees" + 
				     " where hire_date BETWEEN to_date(?,'YYYYMM')and to_date(?,'YYYYMM')" + 
				     " order by hire_date";
		
		ps = conn.prepareStatement(sql);
//		ps.setInt(1, num1);
//		ps.setInt(2, num2);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			
		}
	}
}
