package pg797;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestEx1 {

	public static void main(String[] args) {
		String[] sa = {"ȫ","��","��","��"};
		
		Arrays.asList(sa).stream().forEach(n->System.out.println(n));
		
		System.out.println();
		int[] arr = {1,2,3,4,5};
//		arr.stream(); // �ȵ�
		IntStream is = Arrays.stream(arr);
		is.asDoubleStream().forEach(n->System.out.println(n));
	}
}
