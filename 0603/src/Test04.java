
public class Test04 {

	public static void main(String[] args) {
		int ss= args.length/3;
		int[][] arr =new int[ss][3];
		int k =0;
		
		for(int i=0;i<ss;i++) {
			for(int j=0;j<3;j++) {
				int nn = Integer.parseInt(args[k++]);
				arr[i][j] = nn;
				System.out.print("("+i+","+j+")");
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		for (int i=0; i<arr.length;i++) {
			for(int c:arr[i]) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
