
public class Test03 {

	public static void main(String[] args) {
//		int [][]arr = {{95,80},{77,88,99}};
		int [] arr1 = {90,78,88};
		int [][]arr = {{95,80},
				       {77,88,99},
		               {11,22,33,44,66}};
		int [][][]arr2 = {{{23,54},{55,77}},
				          {{33,66,22}}};
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" ("+i+","+j+")="+arr[i][j]);
			}
			System.out.println();
		}
	}

}
