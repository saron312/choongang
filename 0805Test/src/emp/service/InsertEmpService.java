package emp.service;

import java.sql.Connection;
import java.sql.SQLException;

import emp.dao.EmpDao;
import emp.model.Emp;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class InsertEmpService {
	private static InsertEmpService instance = new InsertEmpService();
	
	public static InsertEmpService getInstance () {
		return instance;
	}
	
	private InsertEmpService () {}
	
	public void insert(Emp emp) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			EmpDao empDao = EmpDao.getInstance();
			empDao.insert(conn, emp);
		} catch (SQLException e) {
			throw new ServiceException("사원 정보 등록 실패~!~!"+ e.getMessage(),e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
