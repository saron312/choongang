package test03;

public class test03_01 {

	public static void main(String[] args) {
		int var1 = 10; //10진수로 저장
		int var2 = 012; //8진수로 저장
		int var3 = 0xA; //16진수로 저장

		//char c1 = ''; //에러남, 아예 아무것도 안쓰면 안됨, 공백이 있는건 가능함
		String str;  //주소만 저장됨, 메모리 사용크기가 지정되지 않음, 리터럴값이 정해지지 않았기때문
		int i1;  //int형이기 때문에 4byte로 메모리 사용크기가 지정됨
		
		str = "sdfsdfsdfsdfsf";
		i1 = 12; 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		//10진수로 변환되어 출력
	}

}
