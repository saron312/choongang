package test03;

public class test03_07 {
	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3 = byteValue1 + byteValue2; //������ ������
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue2 = charValue1+charValue2; // ������ ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = "+intValue2);
		System.out.println("��¹��� = "+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 =10;
		//int intValue6 = 10/4.0; //������ ����
		double doubleValue = intValue5 /4.0;
		System.out.println(doubleValue);

		System.out.println();
		
		String a = "xy";
		String b = "x";
		
		b = b +"y";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b); // �ּҰ��� ������ Ȯ��
		System.out.println(a.equals(b)); // ���� ������ Ȯ��

	}
	
}
