package final_exam;

public class Bbb extends Aaa {
	//상속시 final필드값.. 
	Bbb(String ddd) {
		super(ddd);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String []args) {
		Bbb bb = new Bbb("가나다");
		bb.nnn = "다라마";
//		bb.ccc = "바마사"; //final 값 변경 불가
//		bb.ddd = "하하하"; //final 값 변경 불가 
		
		
	}

}
