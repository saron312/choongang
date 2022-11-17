package test03;

public class test03_02 {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일 에러 -> 끝에 l,L을 붙여줘야함 long형을 쓰는 걸 알리기위함, 4byte int형과 구분하기 위해 사용
		long var4 = 1000000000000L; 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}


