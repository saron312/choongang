package minipj;

import org.apache.ibatis.session.SqlSession;

import minipj.Emp;
import minipj.MyBatisDao;
import minipj.SqlSessionTemplate;

public class MyBatisService {
	private MyBatisDao dao = new MyBatisDao();
	
	public Emp login(String id) {
		SqlSession ses = SqlSessionTemplate.getSession();
		Emp emp= dao.login(ses, id);
		return emp;
	}
	
}
