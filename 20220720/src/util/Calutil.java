package util;

import java.util.List;

public class Calutil {
	public static long sum(List<Long> values) {
		long sum = 0L;
		for(long num:values) {
			sum+=num;
		}
		return sum;
	}
}
