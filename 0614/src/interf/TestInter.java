package interf;

public interface TestInter {
	int i = 100;
	public static final int AAA_BBB = 400; // interface 안에 들어가는 건 무조건 public임. 그래서 public 안붙여도됨
//	int y;
//	void aaa(){} // 인터페이스 안에는 {}중괄호 안되지만 8버전부터는 됨, 현장마다 쓰는 자바버전이 다르니 참고할 것
	default void aaa(){};
	public abstract boolean bbb();
	
	
	static int kkk(){
		return 0;
	}; //static 메소드
}

