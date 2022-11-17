
public class test04_04_01 {
	public static void main(String[] args) {
		try {
			long result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.");
		}
	}
	
	public static long safeAdd(int left, int right) {
		if((right>0)) {
			if(left > (Long.MAX_VALUE - right)) {			
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else { //right<=0�� ���
			if(left<(Long.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}
