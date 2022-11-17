package student.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import student.dao.StudentDao;
import student.model.Student;

public class GetStudentListService {
	private static GetStudentListService instance = new GetStudentListService();

	public static GetStudentListService getInstance() {
		return instance;
	}

	private GetStudentListService() {
	}

	private static final int MESSAGE_COUNT_PER_PAGE = 3;

//	public Student select(int id) {
//		Connection conn = null;
//		try {
//			conn = ConnectionProvider.getConnection();
//			StudentDao studentDao = StudentDao.getInstance();
//			Student student = studentDao.select(conn, id);
//			if(student == null) {
//				throw new StudentNotFoundException("정보 없음");
//			}
//			return student;
//		} catch (SQLException e) {
//			throw new ServiceException("조회 실패"+e.getMessage(),e);
//		} finally {
//			JdbcUtil.close(conn);
//		}
//	}
//	
	public StudentListView getStudentList(int pageNumber) {
		Connection conn = null;
		int currentPageNumber = pageNumber;
		try {
			conn = ConnectionProvider.getConnection();
			StudentDao studentDao = StudentDao.getInstance();

			int messageTotalCount = studentDao.selectCount(conn);

			List<Student> studentList = null;
			int firstRow = 0;
			int endRow = 0;
			if (messageTotalCount > 0) {
				firstRow =
						(pageNumber - 1) * MESSAGE_COUNT_PER_PAGE + 1;
				endRow = firstRow + MESSAGE_COUNT_PER_PAGE - 1;
				studentList =
						studentDao.selectList(conn, firstRow, endRow);
			} else {
				currentPageNumber = 0;
				studentList = Collections.emptyList();
			}
			return new StudentListView(studentList,
					messageTotalCount, currentPageNumber,
					MESSAGE_COUNT_PER_PAGE, firstRow, endRow);
		} catch (SQLException e) {
			throw new ServiceException("목록 구하기 실패: " + e.getMessage(), e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
