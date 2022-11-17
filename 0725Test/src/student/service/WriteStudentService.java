package student.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import student.dao.StudentDao;
import student.model.Student;

public class WriteStudentService {
	private static WriteStudentService instance = new WriteStudentService();

	public static WriteStudentService getInstance() {
		return instance;
	}

	private WriteStudentService() {
	}

	public void write(Student student) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			StudentDao studentDao = StudentDao.getInstance();
			studentDao.insert(conn, student);
		} catch (SQLException e) {
			throw new ServiceException(
					"메세지 등록 실패: " + e.getMessage(), e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
