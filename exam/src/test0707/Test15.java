package test0707;

public class Test15 {
	public static void main(String[] args) {
		int nn = 90;
		boolean tt = false;
		if (nn>=90 && tt==true) { 
			System.out.println("nn="+nn+" or tt="+tt);
		} else if (nn>80 || tt==false) {
			System.out.println("nn="+nn+" or tt="+tt);
		}
	}
}
