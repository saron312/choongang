package test0707;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		//������ �߿� 7�ܸ� ���
		String [] arr = new String[9];
		int a=6; //����� �ܼ� �Է�
		for (int i = 1;i<10;i++) {
			arr[i-1] = a+"x"+i+"="+(a*i);
		}
		System.out.println(a+"�� "+Arrays.toString(arr));
	}
}
