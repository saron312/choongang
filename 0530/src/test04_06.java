
public class test04_06 {
	public static void main(String[] args){
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		//double z = x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2); //������ �Ǵ� �ڵ�
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z+2);
		}
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		///////////////////////////////////////////
		
		
		String userInput2 = "NaN";
		double val2 = Double.valueOf(userInput2);
		
		double currentBalance2 = 10000.0;
		if(Double.isNaN(val2)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����.");
			val2 = 0.0;
		}
		currentBalance2 += val2;
		System.out.println(currentBalance2);
	}
}
