import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ojdbc {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##hr";
		String pw = "hr";
		String sql = "select count(*)+100 as num from employees";
		Statement stat =null;
		ResultSet rs =null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				int col = rs.getInt("num");
				System.out.println(col);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
