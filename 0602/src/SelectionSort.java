
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
					//j=1일 때
					//10>3 -> true -> min = 3이되고, idx = 1이됨
					//j=2일 때 
					//3 > 1 -> true -> min = 1이되고, idx = 2가 됨
					//j=3일 때 
					// 1 > 4 -> false idx = 2
					//j=4일 때
					// 1 > 2 -> false idx = 2
					// 최소값의 인덱스를 찾아내는 중
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
