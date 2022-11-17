package test03;

public class test03_06 {

	public static void main(String[] args) {
		int i =128;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변활할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		}else {
			byte b =(byte) i;
			System.out.println(b);
		}
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
		int num4 = 123456780;
		int num5 = 123456780;
		
		double num6 = num5;
		num5 = (int) num6;
		
		int result2 = num4 - num5;
		System.out.println(result2);
	}

}
