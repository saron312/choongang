package exam;

public class Ccc extends exam0530 {
	public Ccc(int i, String string) {
		super(i,string);
	}
	
	

	@Override //������
	void print() {
		super.print();
		System.out.println("������ ����.....");
	}



	public static void main(String[] args) {
		Ccc cc = new Ccc(500,"CCC");
		cc.ii=700;
		cc.setSS("DDD");
		cc.print();
	}
}
