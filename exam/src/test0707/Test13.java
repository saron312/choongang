package test0707;

public class Test13 {
	public static void main(String[] args) {
		//<보기1>
		int i = 0;
		int ret = 100 + i++;
		System.out.println(ret);
		System.out.println(i);

		//<보기2>
		int j = 0;
		int res = 100 + ++j;
		System.out.println(res);
		System.out.println(j);

	}

}
