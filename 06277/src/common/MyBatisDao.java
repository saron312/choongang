package common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyBatisDao {
	public int insertEx(SqlSession ses,Emp emp) {
		int nn=ses.insert("mybatis.insertEx", emp);
		return nn;
	}
	
	public int insertEx0621(SqlSession ses) {
		int nn = ses.insert("mybatis.insertEx0621");
		return nn;
	}

	public String selectName(SqlSession ses, int nn) {
		String ss = ses.selectOne("mybatis.selectName", nn);
		return ss;
	}
}
