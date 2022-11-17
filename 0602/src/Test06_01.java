
public class Test06_01 {

	public static void main(String[] args) {
//		int[] arr = {2,4,26,3,45,21,34,77,3,1,52};
//		
//		int max = arr[0]; // 초기화
//		int min = arr[0]; // 초기화
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
		//배열의 최대값, 최소값 구하기
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
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}
