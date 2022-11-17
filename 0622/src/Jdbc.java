import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
    	String id = "c##hr";
    	String pw = "hr";
    	Connection conn = null;
    	Statement stat = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	Class.forName("oracle.jdbc.OracleDriver");
    	conn = DriverManager.getConnection(url, id, pw);
//        stat = conn.createStatement();
    	
//        int num = 300;
//        String name = "³ª»ç¶û";
        String sql = "insert into ex3_2(emp_id, emp_name) values (?,?)";
       
        ps = conn.prepareStatement(sql);
        ps.setInt(1, 500);
        ps.setString(2, "¿À»ç¶û");
        int res = ps.executeUpdate();
//        String sql = String.format(
//        "insert into ex3_2(emp_id, emp_name) values (%d,'%s')", num, name);
//        int res = stat.executeUpdate(sql);
//        int res = stat.executeUpdate(
//        "insert into ex3_2(emp_id, emp_name) values ("+num+", '"+name+"')");
        System.out.println(res);
//        rs = stat.executeQuery("select * from employees");
//        while (rs.next()) {
//        	System.out.println(rs.getInt(1));
//        }
//        rs.close();
//        stat.close();
        conn.close();
	}

}








