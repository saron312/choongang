package util;

import java.util.Arrays;
import java.util.List;

public class SumTest {

	public static void main(String[] args) {
		List<Long> values = Arrays.asList(1l,2l,5l,10l);
		long result = Calutil.sum(values);
		System.out.println(result);
	}

}
