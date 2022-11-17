package student.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import student.dao.StudentDao;
import student.model.Student;

public class DeleteStudentService {
	private static  DeleteStudentService instance = new  DeleteStudentService();

	public static  DeleteStudentService getInstance() {
		return instance;
	}

	private  DeleteStudentService() {
	}

	public void deleteStudent(int id, String password) {
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
			studentDao.delete(conn, id);

			conn.commit();
		} catch (SQLException ex) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패:" + ex.getMessage(), ex);
		} catch (InvalidPassowrdException | StudentNotFoundException ex) {
			JdbcUtil.rollback(conn);
			throw ex;
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
