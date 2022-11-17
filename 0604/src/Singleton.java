
public class Singleton {
	private static Singleton ss = new Singleton();
	
	private Singleton() {} //접근제한자
	//public Singleton() {}
	
	static Singleton ddd() {
		return ss;
	}
}
