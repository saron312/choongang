package emp.service;

import java.sql.Connection;
import java.sql.SQLException;

import emp.dao.EmpDao;
import emp.model.Emp;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class DeleteEmpService {
	private static DeleteEmpService instance = new DeleteEmpService();
	
	public static DeleteEmpService getInstance() {
		return instance;
	}
	
	private DeleteEmpService() {}
	
	public void delete(int empId) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			EmpDao empDao = EmpDao.getInstance();
			Emp emp = empDao.select(conn, empId);
			if(emp == null) {
				throw new EmpNotFoundException("사원 없음");
			}
			
			empDao.delete(conn, empId);
			
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패"+e.getMessage(),e);
		}catch(EmpNotFoundException e) {
			JdbcUtil.rollback(conn);
			throw e;
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
