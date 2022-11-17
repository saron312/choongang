package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import emp.model.Emp;
import jdbc.JdbcUtil;

public class EmpDao {
	private static EmpDao empDao = new EmpDao();
	
	public static EmpDao getInstance () {
		return empDao;
	}
	
	private EmpDao() {}
	
	public int insert(Connection conn, Emp emp) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("insert into emp (empName,empAdd,empTel,empImg,empFile) "
										+ "values(?,?,?,?,?)");
			pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpAdd());
			pstmt.setString(3, emp.getEmpTel());
			pstmt.setString(4, emp.getEmpImg());
			pstmt.setString(5, emp.getEmpFile());
			return pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
	
	
	public Emp select(Connection conn, int empId) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("select * from emp where empId = ?");
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return makeEmpResultSet(rs);
			}else {
				return null;
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}

		
	}
	private Emp makeEmpResultSet (ResultSet rs) throws SQLException {
		Emp emp = new Emp();
		emp.setEmpId(rs.getInt("empId"));
		emp.setEmpName(rs.getString("empName"));
		emp.setEmpAdd(rs.getString("empAdd"));
		emp.setEmpTel(rs.getString("empTel"));
		emp.setEmpImg(rs.getString("empImg"));
		emp.setEmpFile(rs.getString("empFile"));
		return emp;
	}
	
	public int selectCount(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select count(*) from emp");
			rs.next();
			return rs.getInt(1);
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
	}

	
	public List<Emp> selectEmpAllList(Connection conn) throws SQLException{
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from emp");
			List<Emp> allEmpList = new ArrayList<Emp>();
			while(rs.next()) {
				allEmpList.add(makeEmpResultSet(rs));
			}
			return allEmpList;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
	}
	
	public List<Emp> selectList(Connection conn, int firstRow, int endRow) throws SQLException{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("select * from emp order by empId desc limit ?,?");
			pstmt.setInt(1, firstRow);
			pstmt.setInt(2, endRow);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				List<Emp> empList = new ArrayList<Emp>();
				do {
					empList.add(makeEmpResultSet(rs));
				}while(rs.next());
				return empList;
			}else {
				return Collections.emptyList();
			}
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
	
	public int delete(Connection conn, int empId) throws SQLException {
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement("delete from emp where empId = ?");
			pstmt.setInt(1, empId);
			
			return pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
}
