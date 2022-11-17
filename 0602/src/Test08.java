
public class Test08 {

	public static void main(String[] args) {
//		int a[] = {10,3,1,4,2};	
//		int idx = 0;
//		int find = 4;
//		//4를 찾아서 인덱스를 출력
//		for(int i=0;i<a.length;i++) {
//			if(a[i]== find) {
//				idx = i;
//				break;
//			}
//		}
//		System.out.println("4의 인덱스:"+idx);
		
		//인덱스를 찾아서 출력
		int a[] = {1,5,6,3,4,2};
		int idx = 0;
		int find = 5 ; //찾고자하는 숫자의 인덱스
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==find) {
				idx = i;
			}
		}
		System.out.println("5의 인덱스 ="+idx);
	}

}
