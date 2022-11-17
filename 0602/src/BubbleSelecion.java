
public class BubbleSelecion {

	public static void main(String[] args) {
		int [] arr= {2,5,1,7,4,9,6,3,8};
		
		for(int i=0;i<arr.length;i++) {
			int min = arr[i];
			int idx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int [] arr2= {2,5,1,7,4,9,6,3,8};
		
		for(int i=0;i<arr2.length-1;i++) {
			for(int j=arr2.length-1;j>i;j--) {
				if(arr2[j]<arr2[j-1]) {
					int tmp = arr2[j];
					arr2[j] = arr2[j-1];
					arr2[j-1] = tmp;
				}
			}
		}
		
		for(int b:arr2) {
			System.out.print(b+" ");
		}
	}

}
