package student.service;

import java.sql.Connection;
import java.sql.SQLException;

import student.service.ServiceException;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import student.dao.StudentDao;
import student.model.Student;

public class StudentScoreService {
	private static StudentScoreService instance = new StudentScoreService();
	
	public static StudentScoreService getInstance() {
		return instance;
	}
	
	private StudentScoreService() {}
	
	public Student selectScore(int id) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			StudentDao studentDao = StudentDao.getInstance();
			Student student = studentDao.resultScore(conn, id);
			if(student == null) {
				throw new StudentNotFoundException("���� ����");
			}
			return student;
		} catch (SQLException e) {
			throw new ServiceException("��ȸ ����"+e.getMessage(),e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
