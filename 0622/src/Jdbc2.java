import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
    	String id = "c##hr";
    	String pw = "hr";
    	Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Class.forName("oracle.jdbc.OracleDriver");
    	conn = DriverManager.getConnection(url, id, pw);
    	String sql = "select last_name from employees where last_name like ?";
    	
    	ps = conn.prepareStatement(sql);
    	ps.setString(1, "%er%");
    	rs = ps.executeQuery();
    	
    	while (rs.next()) {
    		System.out.println(rs.getString("last_name"));
    	}
        rs.close();
        ps.close();
        conn.close();
	}

}












