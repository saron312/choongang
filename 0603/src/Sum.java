

public class Sum {

	public static void main(String[] args) {
		int a[] = {1,3,10,2,8};
		int sum = 0;
		int max = a[0]; //초기화
		int min = a[0]; //초기화
		int search = 2; //2의 있는 인덱스를 찾는다
		int find = -1; //찾다가 없으면 -1 그대로 출력 //인덱스 저장
		
		for(int i=0; i<a.length;i++) {
			sum += a[i];
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
			if(a[i] == search) {
				find = i;
			}
		}
		
//		for(int c:a) {//위의 형식과 같음
//			sum += c;
//			if(max<c) {
//				max = c;
//			}
//			if(min>c) {
//				min = c;
//			}
//		}  //인덱스를 쓸 수 없는 것이 단점/
		
		
		float avg = (float)sum/a.length;
		System.out.println("Sum="+sum);
		System.out.println("Avg="+avg);
		System.out.println("최대값="+max);
		System.out.println("최소값="+min);
		System.out.println("2가 있는 인덱스="+find);
		
	}

}
