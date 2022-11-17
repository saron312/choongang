
public class Test06 {

	public static void main(String[] args) {
		int a[]= {7,6,10,3,12,2,8,1,4};
		
		int max=a[0]; //단순 초기화 
		int min=a[0];
		
		for(int i = 0 ; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);

	}

}
