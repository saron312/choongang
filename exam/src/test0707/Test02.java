package test0707;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
//		������ ���
		String[] arr = new String[9];
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				arr[j-1] = i+"x"+j+"="+(i*j);
			}
			System.out.println(i+"�� "+ Arrays.toString(arr));
		}
	}
}
