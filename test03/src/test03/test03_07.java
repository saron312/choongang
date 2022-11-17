package test03;

public class test03_07 {
	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러남
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue2 = charValue1+charValue2; // 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = "+intValue2);
		System.out.println("출력문자 = "+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 =10;
		//int intValue6 = 10/4.0; //컴파일 에러
		double doubleValue = intValue5 /4.0;
		System.out.println(doubleValue);

		System.out.println();
		
		String a = "xy";
		String b = "x";
		
		b = b +"y";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b); // 주소값이 같은지 확인
		System.out.println(a.equals(b)); // 값이 같은지 확인

	}
	
}
