package common;

import org.apache.ibatis.session.SqlSession;

public class MyBatisService {
	private MyBatisDao dao = new MyBatisDao();

	public int insertEx(Student st) {
		SqlSession ses = SqlSessionTemplate.getSession();
		int nn = dao.insertEx(ses,st);
		if(nn > 0) {
			ses.commit();
		}else {
			ses.rollback();
		}
		ses.close();
		return nn;
	}
	

}
