package interf3;

public class Exam {

	public static void main(String[] args) {
		Aaa aa = new Bbb();
		aa.run();
		
		Aaa aa2 = null;
		if(aa2 instanceof Bbb) {
			Bbb bb = (Bbb)aa;
			bb.ccc();
		}else {
			System.out.println("���� ����ȯ �ȵ�");
		}
		
//		((Bbb)aa).ccc();
	}

}
