
public class test04_03 {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		// 산출값이 int타입인데 int 값의 범위를 초과하게 되어서 오버플로우 됨. 따라서 쓰레기 값인 애매한 숫자가 나와버림. 
		
		int a = 1000000;
		int b = 1000000;
		long c = a*b;
		System.out.println(c);
		
		// a,b중 하나라도 long형이 되어야하고 변수 c도 long타입이어야한다. 위와 같은 경우에는
		//이미 오버플로우가 난 상태에서 long형 그릇에 담는 것이기 때문에 동일한 값이 나와버림.
		
		int q = 1000000;  
		long w = 1000000;
		long e = q*w;
		System.out.println(e);
	}

}
