package emp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import emp.dao.EmpDao;
import emp.model.Emp;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class ListEmpService {
	private static ListEmpService instance = new ListEmpService();
	public static ListEmpService getInstance () {
		return instance;
	}
	private ListEmpService() {}

	private static final int EMP_COUNT_PER_PAGE = 3;
	
	public EmpListView selectEmpList(int pageNum) {
		Connection conn = null;
		int selectPageNum = pageNum;
		try {
			conn = ConnectionProvider.getConnection();
			
			EmpDao empDao = EmpDao.getInstance();
			int empTotalCount = empDao.selectCount(conn);
			
			List<Emp> empList = null;
			int firstRow = 0;
			int endRow = 0;
			if(selectPageNum>0) {
				firstRow = (pageNum-1)*EMP_COUNT_PER_PAGE;
				endRow = EMP_COUNT_PER_PAGE;
				
				empList = empDao.selectList(conn, firstRow, endRow);
			}else{
				selectPageNum = 0;
				empList = Collections.emptyList();
			}
			return new EmpListView(empTotalCount, selectPageNum, empList, 
								   EMP_COUNT_PER_PAGE, firstRow, endRow);
		} catch (SQLException e) {
			throw new ServiceException("목록 구하기 실패:"+e.getMessage(),e);
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
