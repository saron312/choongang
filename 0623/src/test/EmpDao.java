package test;

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
    
    public int input(Emp emp) throws SQLException, ClassNotFoundException {
    	PreparedStatement ps = null;
        String sql = "insert into ex0621(emp_id, emp_name, emp_salary) values (?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, emp.empId);
        ps.setString(2, emp.name);
        ps.setInt(3, emp.salary);
        int result = ps.executeUpdate();
        conn.close();
		return result;
    }
    
    public int modify(Emp emp) throws SQLException {
       	PreparedStatement ps = null;
        String sql = "update ex0621 set emp_salary = ? where emp_id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, emp.salary);
        ps.setInt(2, emp.empId);
        int result = ps.executeUpdate();
		return result;
    }
    
    public int remove(Emp emp) throws SQLException {
    	PreparedStatement ps = null;
    	
        String sql = "delete from ex0621 where emp_id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1,emp.empId);
        int result = ps.executeUpdate();
        conn.close();
		return result;
    }
    
    public ArrayList<Emp> lists() throws SQLException, ClassNotFoundException {
    	Statement stat = null;
        ResultSet rs = null;
        stat = conn.createStatement();
//        String sql = "select * from ex0621";
        rs = stat.executeQuery("select * from ex0621");
        
        ArrayList<Emp> empList = new ArrayList<Emp>();
    	while(rs.next()) {
			int empId = rs.getInt("emp_id");
			String name = rs.getString("emp_name");
			int salary = rs.getInt("emp_salary");
			empList.add(new Emp(empId,name,salary));
			}
    	rs.close();
		return empList;
    }
    
    public Emp printName(int modifyEmdId) throws SQLException {
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	ps = conn.prepareStatement("select emp_name, emp_salary from ex0621 where emp_id = ?");
    	ps.setInt(1, modifyEmdId);
    	rs = ps.executeQuery();
    	rs.next();
    	String modifyName = rs.getString("emp_name");
    	int modifySalary = rs.getInt("emp_salary");
    	return new Emp(modifyEmdId, modifyName, modifySalary);
    }
    
}
