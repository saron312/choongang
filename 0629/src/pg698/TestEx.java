package pg698;

import java.util.function.IntBinaryOperator;

public class TestEx {
	static int[] sc = { 92, 95, 87 };

	public static int aaa(IntBinaryOperator op) {
		int ret = sc[0];
		for (int aa : sc) {
			ret = op.applyAsInt(ret, aa);
		}
		return ret;

	}

	public static void main(String[] args) {
		int max = aaa(
			(x,y)->{
			if(x>y)return x;
			else return y;
			});
		System.out.println("최대값:"+max);
		
		int min = aaa(
				(x,y)->{
				if(x<=y)return x;
				else return y;
				});
			System.out.println("최소값:"+min);
	}
}
