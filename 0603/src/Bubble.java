

public class Bubble {

	public static void main(String[] args) {

//		int a[] = {10,3,1,4};
//		
//		for (int i =0; i<a.length-1;i++) {
//			for(int j=a.length-1;j>i;j--) {
////				System.out.println(i+","+j);
//				if(a[j]<a[j-1]){
//					int tmp = a[j];
//					a[j] = a[j-1];
//					a[j-1] = tmp;			
//				}
//			}
//			//System.out.println("----------------");
//		}
//		for (int c :a) {
//			System.out.print(c+" ");
//		}
		
		int a[] = {10,3,1,8,6,4,7};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					int tmp = a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
