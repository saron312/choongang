
public class Test06 {

	public static void main(String[] args) {
		int [][] arr= {{30,40,50},{50,60,70,80}};
		int [][] arr2=new int[arr.length][];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		for(int i=0;i<arr2.length;i++) {
//			for(int cc:arr2[i]) {
			//System.out.println(arr2[i].length);
			for(int j=0;j< arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
