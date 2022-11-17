
public class ex05 {

	public static void main(String[] args) {
		int [][] arr = {{95,86},
						{83,92,96},
						{78,83,93,87,88}};
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: "+max);
		
		
		int sum =0;
		double avg =0.0;
		
		int cc =0;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.println("("+arr[i][j]+")");
				sum += arr[i][j];
				cc++; // c= c+1;
				//System.out.println(cc);
			}
		}
		
		avg = (double)sum / cc;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		
	}

}
