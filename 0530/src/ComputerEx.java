
public class ComputerEx {

	public static void main(String[] args) {
		int r = 10;
		
		Calcul calcul = new Calcul();
		System.out.println("원면적 : "+calcul.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r)); //재정의된 메소드 호출
		
	}

}
