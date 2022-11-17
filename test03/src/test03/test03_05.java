package test03;

public class test03_05 {
	public static void main(String[] args) {
		
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue; // int <- byte... byte형이 자동적으로 더 큰 int형이 됨
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // int <- char ...char의 유니코드 값이 int형으로 저장됨
		System.out.println("가의 유니코드 : "+intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int...int형이 더 큰 long형으로 저장됨
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; //double<-int 정수int형이 실수double형으로 변환되어 저장됨
		                                         //실수형이 표현할 수 있는 값의 범위가 더 크기 때문에 정수형보다 더 큰타입으로 ...취급?
		System.out.println(doubleValue);
		System.out.println("-----------");
		
		//강제 타입 변환
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
