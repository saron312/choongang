
public class Test08 {

	public static void main(String[] args) {
//		int a[] = {10,3,1,4,2};	
//		int idx = 0;
//		int find = 4;
//		//4�� ã�Ƽ� �ε����� ���
//		for(int i=0;i<a.length;i++) {
//			if(a[i]== find) {
//				idx = i;
//				break;
//			}
//		}
//		System.out.println("4�� �ε���:"+idx);
		
		//�ε����� ã�Ƽ� ���
		int a[] = {1,5,6,3,4,2};
		int idx = 0;
		int find = 5 ; //ã�����ϴ� ������ �ε���
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==find) {
				idx = i;
			}
		}
		System.out.println("5�� �ε��� ="+idx);
	}

}
