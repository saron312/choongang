
public class Singleton {
	private static Singleton ss = new Singleton();
	
	private Singleton() {} //����������
	//public Singleton() {}
	
	static Singleton ddd() {
		return ss;
	}
}
