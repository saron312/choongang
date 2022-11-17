package minipj;

import org.apache.ibatis.session.SqlSession;

import minipj.Emp;

public class MyBatisDao {
	
	public Emp login(SqlSession ses, String id) {
		Emp emp = ses.selectOne("mybatis.login",id);
		return emp;
	}
	
}
