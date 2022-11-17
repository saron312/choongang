
public class Test03 {

	public static void main(String[] args) {
//		int[] sc = {89,67,58}; //리터럴 값으로 방이 잡힘 - 배열 array
//		
//		System.out.println(sc[0]);
//		System.out.println(sc[1]);
//		System.out.println(sc[2]);
//		
//		System.out.println(sc.length);//인덱스의 개수
		
//		int[] arr = {10,5,6,8,10,14,5,6,3,5};
//		int sum = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			sum += arr[i];
//			//System.out.println(arr[i]);
//		}
//		double avg = (double)sum/arr.length; 
//		System.out.println("총합은 :"+sum);
//		System.out.println("평균은 :"+avg);
		
		//배열의 합과 평균을 구하시오
		int[] arr = {10,5,6,8,10,14,5,6,3,5};
		int sum = 0;
		
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("배열의 총합 : "+sum);
		System.out.println("배열의 평균 : "+ (double)sum/arr.length);
		
		
	}

}
