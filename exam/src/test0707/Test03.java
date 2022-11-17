package test0707;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		//구구단 중에 7단만 출력
		String [] arr = new String[9];
		int a=6; //출력할 단수 입력
		for (int i = 1;i<10;i++) {
			arr[i-1] = a+"x"+i+"="+(a*i);
		}
		System.out.println(a+"단 "+Arrays.toString(arr));
	}
}
