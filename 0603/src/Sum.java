

public class Sum {

	public static void main(String[] args) {
		int a[] = {1,3,10,2,8};
		int sum = 0;
		int max = a[0]; //�ʱ�ȭ
		int min = a[0]; //�ʱ�ȭ
		int search = 2; //2�� �ִ� �ε����� ã�´�
		int find = -1; //ã�ٰ� ������ -1 �״�� ��� //�ε��� ����
		
		for(int i=0; i<a.length;i++) {
			sum += a[i];
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
			if(a[i] == search) {
				find = i;
			}
		}
		
//		for(int c:a) {//���� ���İ� ����
//			sum += c;
//			if(max<c) {
//				max = c;
//			}
//			if(min>c) {
//				min = c;
//			}
//		}  //�ε����� �� �� ���� ���� ����/
		
		
		float avg = (float)sum/a.length;
		System.out.println("Sum="+sum);
		System.out.println("Avg="+avg);
		System.out.println("�ִ밪="+max);
		System.out.println("�ּҰ�="+min);
		System.out.println("2�� �ִ� �ε���="+find);
		
	}

}
