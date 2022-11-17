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
				throw new EmpNotFoundException("��� ����");
			}
			
			return emp;
		} catch (SQLException e) {
			throw new ServiceException("��ȸ ����?"+e.getMessage(),e);
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
