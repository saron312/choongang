package student.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import student.dao.StudentDao;
import student.model.Student;

public class CorrectStudentService {
	private static  CorrectStudentService instance = new CorrectStudentService();

	public static  CorrectStudentService getInstance() {
		return instance;
	}

	private  CorrectStudentService() {
	}

	public void correctStudent(int id, String password, int korScore, int mathScore, int engScore) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			StudentDao studentDao = StudentDao.getInstance();
			Student student = studentDao.select(conn, id);
			
			if (student == null) {
				throw new StudentNotFoundException("메세지없음");
			}
			if (!student.matchPassword(password)) {
				throw new InvalidPassowrdException("bad password");
			}
			studentDao.correct(conn,id, korScore, mathScore, engScore);

			conn.commit();
		} catch (SQLException ex) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("수정 실패:" + ex.getMessage(), ex);
		} catch (InvalidPassowrdException | StudentNotFoundException ex) {
			JdbcUtil.rollback(conn);
			throw ex;
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
