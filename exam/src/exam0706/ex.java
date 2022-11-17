package exam0706;

import java.util.Arrays;

public class ex {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int a = 1;
		int b = 1000;
		for(int i = a; i <= b; i++) {
		    int tmp = i;
		    do {
		    	arr[tmp % 10]++;
		    }while((tmp /= 10) != 0);
		}
		System.out.println(Arrays.toString(arr));
	}
}
