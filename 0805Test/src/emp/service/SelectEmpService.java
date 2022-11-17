package emp.service;

import java.sql.Connection;
import java.sql.SQLException;

import emp.dao.EmpDao;
import emp.model.Emp;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class SelectEmpService {
	private static SelectEmpService instance = new SelectEmpService();
	public static SelectEmpService getInstance() {
		return instance;
	}
	
	private SelectEmpService() {}
	
	public Emp select(int empId) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			
			EmpDao empDao = EmpDao.getInstance();
			Emp emp = empDao.select(conn, empId);
			if(emp == null) {
				throw new EmpNotFoundException("사원 없음");
			}
			
			return emp;
		} catch (SQLException e) {
			throw new ServiceException("조회 실패?"+e.getMessage(),e);
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
