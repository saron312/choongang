
public class Bubble {
	public static void main (String[] args) {

		int arr [] = {2,6,5,8,1,9};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
		for(int c:arr) {
			System.out.print(c+" ");
		}
	}
}
