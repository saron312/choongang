package interf2;

public class Bbb implements Aaa{

	@Override
	public void aaa() {
		System.out.println(Aaa.MAX);
		Aaa.hhh();
	}

	@Override
	public void ddd(String ss) {
		// TODO Auto-generated method stub
		Aaa.super.ddd(ss);
	}
	
}
