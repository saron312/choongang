
public class Test05 {

	public static void main(String[] args) {

//		int[] arr= {30,40,50};
//		int[] arr2 = new int [arr.length];
//		
//		System.arraycopy(arr, 0, arr2, 0, arr.length); //배열 카피
//		
////		for(int i=0;i<arr.length;i++) {
////			arr2[i]=arr[i];
////		} //배열 카피
//
//		for(int cc:arr2) {
//			System.out.println(cc);
//		}
		
		int[] oArr = {10,20,30,40,50};
		int[] nArr = new int [oArr.length];
		
		System.arraycopy(oArr, 0, nArr, 0, oArr.length);
		for(int i:nArr) {
			System.out.println(i);
		}
		
//		for(int i=0;i<oArr.length;i++) {
//			nArr[i]=oArr[i];
//			System.out.println(nArr[i]);
//		}
	}
}
