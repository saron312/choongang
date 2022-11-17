package getset;

public class Test01 {
	private int aa;
	private boolean bb;

	
	
//	public void yyy() {
//		this.aa = 90;
//		bb = true;
//	}
	
	//»ó´Ü¹Ù Source Generate Getters and Setters
	public int getAa() {
		return aa;
	}


	public void setAa(int aa) {
		if(aa<0) {
			this.aa = aa;
			return;
		}
		this.aa=aa;
	}


	public boolean isBb() {
		return bb;
	}


	public void setBb(boolean bb) {
		this.bb = bb;
	}



	public static void main(String[] args) {
		Test01 tt = new Test01();
		tt.aa = 90; 
	}
}
