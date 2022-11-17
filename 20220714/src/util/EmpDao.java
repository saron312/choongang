package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	private Connection conn;
	
    public Connection connect() throws ClassNotFoundException, SQLException {
    	conn = DBconn.getConnection();
		return conn;
    }
	
	public Employees getEmployees(int id, Employees emp) throws SQLException {
		ResultSet rs = null;
		PreparedStatement ps = null;
		ps = conn.prepareStatement("select employee_id, first_name, email, salary "+
								   "from employees where employee_id=?");
		ps.setInt(1, id);
		rs=ps.executeQuery();
		rs.next();
//		Employees emp = new Employees();
		int employee_id = rs.getInt("employee_id");
		int salary = rs.getInt("salary");
		String first_name = rs.getString("first_name");
		String email = rs.getString("email");
//		if(rs.next()) {
//			emp.setEmployee_id(rs.getInt("employee_id"));
//			emp.setSalary(rs.getInt("salary"));
//			emp.setFirst_name(rs.getString("first_name"));
//			emp.setEmail(rs.getString("email"));
//		}
		return new Employees(employee_id,first_name,salary,email); 
	}
}
