
public class Test06_01 {

	public static void main(String[] args) {
//		int[] arr = {2,4,26,3,45,21,34,77,3,1,52};
//		
//		int max = arr[0]; // �ʱ�ȭ
//		int min = arr[0]; // �ʱ�ȭ
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//		}
//		System.out.println("�ִ밪:"+max);
//		System.out.println("�ּҰ�:"+min);
		
		//�迭�� �ִ밪, �ּҰ� ���ϱ�
		int[] arr = {2,4,26,3,45,21,34,77,3,1,52};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
		
	}

}
