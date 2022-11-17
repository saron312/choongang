package test;

public class TestEx {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> cls = Class.forName("test.Member");
		Member mb = (Member)cls.newInstance();
		mb.setId("111");
		mb.setName("홍길동");
		mb.setAddr("서울 강남");
		System.out.println(mb);
	}

}
