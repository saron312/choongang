package student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jdbc.JdbcUtil;
import student.model.Student;

public class StudentDao {
	private static StudentDao studentDao = new StudentDao();
	public static StudentDao getInstance() {
		return studentDao;
	}
	
	private StudentDao() {}
	
	public int insert(Connection conn, Student student) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"insert into student " + 
					"(password, studentName,korScore,mathScore,engScore,message) values (?, ?,?,?,?,?)");
			pstmt.setString(1, student.getPassword());
			pstmt.setString(2, student.getStudentName());
			pstmt.setInt(3, student.getKorScore());
			pstmt.setInt(4, student.getMathScore());
			pstmt.setInt(5, student.getEngScore());
			pstmt.setString(6, student.getMessage());
			return pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
	}

	public Student select(Connection conn, int id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(
					"select * from student where id = ?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return makeMessageFromResultSet(rs);
			} else {
				return null;
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	public Student resultScore(Connection conn, int id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("select * from student_view where id = ?");
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return makeScoreFromResultSet(rs);
			} else{
				return null;
			}
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	private Student makeScoreFromResultSet(ResultSet rs) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setAvgScore(rs.getInt("avgScore"));
		student.setSumScore(rs.getInt("sumScore"));
		student.setRank(rs.getInt("rank"));
		student.setKorRank(rs.getInt("korRank"));
		student.setMathRank(rs.getInt("mathRank"));
		student.setEngRank(rs.getInt("engRank"));
		return student;
	}

	private Student makeMessageFromResultSet(ResultSet rs) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setStudentName(rs.getString("studentName"));
		student.setPassword(rs.getString("password"));
		student.setKorScore(rs.getInt("korScore"));
		student.setMathScore(rs.getInt("mathScore"));
		student.setEngScore(rs.getInt("engScore"));
		student.setMessage(rs.getString("message"));
		return student;
	}

//	public Student selectScore(Connection conn) throws SQLException {
//		PreparedStatement pstmt = null;
//    	ResultSet rs = null;
//    	try {
//			pstmt = conn.prepareStatement("select round(avg(korScore),2) avgKor,round(avg(mathScore),2)"+
//									   "avgMath,round(avg(engScore),2) avgEng from student");
//			rs = pstmt.executeQuery();
//	    	if(rs.next()) {
//	    		int avgKor = rs.getInt("avgKor");
//	    		int avgMath = rs.getInt("avgMath");
//	    		int avgEng = rs.getInt("avgEng");
//	    		return new Student(avgKor, avgMath, avgEng); 
//	    	} else {
//	    		return null;
//	    	}
//		} finally {
//			JdbcUtil.close(rs);
//			JdbcUtil.close(pstmt);
//		}
    	
//	}
	public int selectCount(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select count(*) from student");
			rs.next();
			return rs.getInt(1);
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
	}

	public List<Student> selectList(Connection conn, int firstRow, int endRow) 
			throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(
					"select * from student " + 
					"order by id desc limit ?, ?");
			pstmt.setInt(1, firstRow - 1);
			pstmt.setInt(2, endRow - firstRow + 1);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				List<Student> studentList = new ArrayList<Student>();
				do {
					studentList.add(makeMessageFromResultSet(rs));
				} while (rs.next());
				return studentList;
			} else {
				return Collections.emptyList();
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	public int delete(Connection conn, int id) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"delete from student where id = ?");
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
	
	public int correct(Connection conn,int id, int korScore, int mathScore, int engScore) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"update student set korScore = ?, mathScore = ?, engScore= ? where id = ?");
			pstmt.setInt(1, korScore);
			pstmt.setInt(2, mathScore);
			pstmt.setInt(3, engScore);
			pstmt.setInt(4, id);
			return pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
}
