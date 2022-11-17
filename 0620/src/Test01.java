import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

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
		
		rs = stat.executeQuery("select to_char(hire_date,'YYYY\"년 \"MM\"월 \"DD\"일\"') from employees"); //고정형
		while(rs.next()) {
			String hireDate = rs.getString(1);
			
			System.out.printf("%s \n",hireDate);
		}
		rs.close();
		stat.close();
		conn.close();
	}

}
