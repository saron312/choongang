
public class Test01 {
	static String ss;
	static {ss="Test";} //������ó��..
	
	Test01(String ss){
		this.ss=ss;
	}
	
	public static void main(String[] args) {
		//Test01.ss = "�׽�Ʈ";
		System.out.println(Test01.ss);
		//Test01 ts = new Test01("�׽�Ʈ");
		//System.out.println(ts.ss);
	}
}
