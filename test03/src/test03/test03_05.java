package test03;

public class test03_05 {
	public static void main(String[] args) {
		
		//�ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue; // int <- byte... byte���� �ڵ������� �� ū int���� ��
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; // int <- char ...char�� �����ڵ� ���� int������ �����
		System.out.println("���� �����ڵ� : "+intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int...int���� �� ū long������ �����
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //double<-int ����int���� �Ǽ�double������ ��ȯ�Ǿ� �����
		                                         //�Ǽ����� ǥ���� �� �ִ� ���� ������ �� ũ�� ������ ���������� �� ūŸ������ ...���?
		System.out.println(doubleValue);
		System.out.println("-----------");
		
		//���� Ÿ�� ��ȯ
		int intValue2 = 44032;
		char charValue2 = (char) intValue2;
		System.out.println(charValue2);
		
		long longValue2 = 500;
		intValue2 = (int) longValue2;
		System.out.println(intValue2);
		
		double doubleValue2 = 3.14;
		intValue2 = (int) doubleValue2;
		System.out.println(intValue2);
	}
}
