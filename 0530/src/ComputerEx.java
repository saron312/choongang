
public class ComputerEx {

	public static void main(String[] args) {
		int r = 10;
		
		Calcul calcul = new Calcul();
		System.out.println("������ : "+calcul.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������ : "+computer.areaCircle(r)); //�����ǵ� �޼ҵ� ȣ��
		
	}

}
