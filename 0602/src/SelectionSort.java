
public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		
		print(a);
		for(int i =0;i<a.length-1;i++) {
			int min = a[i];
			int idx = i;
			for(int j=i+1;j<a.length;j++) {

				if(min>a[j]) {
					min = a[j];
					idx = j;
					//j=1�� ��
					//10>3 -> true -> min = 3�̵ǰ�, idx = 1�̵�
					//j=2�� �� 
					//3 > 1 -> true -> min = 1�̵ǰ�, idx = 2�� ��
					//j=3�� �� 
					// 1 > 4 -> false idx = 2
					//j=4�� ��
					// 1 > 2 -> false idx = 2
					// �ּҰ��� �ε����� ã�Ƴ��� ��
				} 
			} 
			int tmp = a[i]; 
			a[i]=a[idx]; 
			a[idx]=tmp; 
			print(a);
		}

		
	}
	public static void print(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
