package ssss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
    private Connection conn;
    public Connection connect() throws ClassNotFoundException, SQLException {
    	conn = DBconn.getConnection();
		return conn;
    }
    public int input(Emp emp) throws SQLException {
    	PreparedStatement ps = null;
    	String sql = "insert into ex0621(emp_id, emp_name) values (?,?)";
    	ps = conn.prepareStatement(sql);
    	ps.setInt(1, emp.employee_id);
    	ps.setString(2, emp.first_name);
    	int ret = ps.executeUpdate();
		return ret;
    	
    }
    public int modify(Emp emp) throws SQLException {
    	PreparedStatement ps = null;
    	String sql = "update ex3_2 set emp_name = ? where emp_id = ?";
    	ps = conn.prepareStatement(sql);
    	ps.setString(1, emp.first_name);
    	ps.setInt(2, emp.employee_id);
    	int ret = ps.executeUpdate();
    	return ret;
    	
    }
    public int remove(Emp emp) throws SQLException {
    	PreparedStatement ps = null;
    	String sql = "delete from Ex3_2 where emp_id = ?";
    	ps = conn.prepareStatement(sql);
    	ps.setInt(1, emp.employee_id);
    	int ret = ps.executeUpdate();
		return ret;
    	
    }
    public Emp getEmp(int id) throws SQLException {
    	ResultSet rs = null;
    	PreparedStatement ps = null;
    	ps = conn.prepareStatement(
    			"select emp_id, emp_name from ex0621 where emp_id = ?");
    	ps.setInt(1, id);
    	rs = ps.executeQuery();
    	if (rs.next()) {
    		int emp_id = rs.getInt("emp_id");
    		String emp_name = rs.getString("emp_name");
        	Emp emp = new Emp(emp_id, emp_name);
    		return emp;
    	}
    	return new Emp(id, "자료없음");
    	
    }
    public ArrayList<Emp> lists() throws SQLException {
    	ResultSet rs = null;
    	Statement state = conn.createStatement();
    	rs = state.executeQuery("select * from employees");
    	ArrayList<Emp> list = new ArrayList<Emp>();
    	while(rs.next()) {
    		int employee_id = rs.getInt("employee_id");
    		String first_name = rs.getString("first_name");
    		int salary = rs.getInt("salary");
    		list.add(new Emp(employee_id, first_name, salary));
    	}
		return list;
    	
    }
}











