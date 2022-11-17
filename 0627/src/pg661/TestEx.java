package pg661;

public class TestEx {

	public static void main(String[] args) {
		Box<Integer> b1 = Util.<Integer>boxing(1000);
		int nn = b1.getT();
		System.out.println(nn);
		
		Box<String> b2= Util.<String>boxing("°¡³ª´Ù");
		String ss = b2.getT();
		System.out.println(ss);
	}

}
