
public class CarReturnExam {
	public static void main(String[] args) {
		CarReturn myCar = new CarReturn();
		
		myCar.setGas(5); //CarReturn�� setGas()�޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas(); // CarReturn�� isLeftGas()�޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); //Car�� run()�޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) { //Car�� isLeftGas()�޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
