
public class Selection {

	public static void main(String[] args) {
		int a[] = {10,3,1,8,6,4,7};
		
		for(int i=0; i<a.length;i++) {
			int min = a[i];
			int idx = i;
			for(int j=i+1;j<a.length;j++) {
				if(min>a[j]) {
					min = a[j];
					idx = j;
				}
			}
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	
	}

}
