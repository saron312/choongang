package common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisService {
	private MyBatisDao dao = new MyBatisDao();

	public int insertEx(Emp emp) {
		SqlSession ses = SqlSessionTemplate.getSession();
		int nn = dao.insertEx(ses,emp);
		if(nn > 0) {
			ses.commit();
		}else {
			ses.rollback();
		}
		ses.close();
		return nn;
	}
	
	public String selectName(int nn) {
		SqlSession ses = SqlSessionTemplate.getSession();
		String ss= dao.selectName(ses,nn);
		return ss;
	}
	
	public int insertEx0621() {
		SqlSession ses = SqlSessionTemplate.getSession();
		int nn = dao.insertEx0621(ses);
		if(nn > 0) {
			ses.commit();
		}else {
			ses.rollback();
		}
		ses.close();
		return nn;
	}
}
