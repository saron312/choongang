package pg797;

import java.util.Arrays;

public class LoopingEx {
	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5};
		int total = Arrays.stream(intArr).peek(n->System.out.println(n)).sum();
		System.out.println("ÃÑÇÕ: "+total);
		double total2 = Arrays.stream(intArr).peek(n->System.out.println(n)).average().getAsDouble();
		System.out.println("Æò±Õ: "+total2);
	}
}
