package inheritance;

public class Bbb extends Aaa {
	
	String name;
	
	Bbb(String nn, int jj) {
		super(nn, jj);
	}
	
	Bbb(String nn, int jj, String name){
		super(nn,jj);
		this.name = name;
	}
	
	@Override
	public void ppp() {
		System.out.println("ÀÚ½ÄÀÇ ppp()");
		super.qqq();
	}
	

}
