
public class test04_03 {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		// ���Ⱚ�� intŸ���ε� int ���� ������ �ʰ��ϰ� �Ǿ �����÷ο� ��. ���� ������ ���� �ָ��� ���ڰ� ���͹���. 
		
		int a = 1000000;
		int b = 1000000;
		long c = a*b;
		System.out.println(c);
		
		// a,b�� �ϳ��� long���� �Ǿ���ϰ� ���� c�� longŸ���̾���Ѵ�. ���� ���� ��쿡��
		//�̹� �����÷ο찡 �� ���¿��� long�� �׸��� ��� ���̱� ������ ������ ���� ���͹���.
		
		int q = 1000000;  
		long w = 1000000;
		long e = q*w;
		System.out.println(e);
	}

}
