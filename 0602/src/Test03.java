
public class Test03 {

	public static void main(String[] args) {
//		int[] sc = {89,67,58}; //���ͷ� ������ ���� ���� - �迭 array
//		
//		System.out.println(sc[0]);
//		System.out.println(sc[1]);
//		System.out.println(sc[2]);
//		
//		System.out.println(sc.length);//�ε����� ����
		
//		int[] arr = {10,5,6,8,10,14,5,6,3,5};
//		int sum = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			sum += arr[i];
//			//System.out.println(arr[i]);
//		}
//		double avg = (double)sum/arr.length; 
//		System.out.println("������ :"+sum);
//		System.out.println("����� :"+avg);
		
		//�迭�� �հ� ����� ���Ͻÿ�
		int[] arr = {10,5,6,8,10,14,5,6,3,5};
		int sum = 0;
		
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("�迭�� ���� : "+sum);
		System.out.println("�迭�� ��� : "+ (double)sum/arr.length);
		
		
	}

}
