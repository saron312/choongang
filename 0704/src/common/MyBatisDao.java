package common;

import org.apache.ibatis.session.SqlSession;

public class MyBatisDao {
	public int insertEx(SqlSession ses,Student st) {
		int nn=ses.insert("mybatis.insertEx", st);
		return nn;
	}
	
}
