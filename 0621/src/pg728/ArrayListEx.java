package pg728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> bb = new ArrayList();
		bb.add(100);
		bb.add(200);
		bb.add(300);
		
		int nn = bb.get(0);
		System.out.println(nn);
		
		
		List<String> aa = new ArrayList();
		aa.add("È«±æµ¿");
		aa.add("±è»ç¶û");
		aa.add("ÀÌÇÏ³ª");
		
		String ss = aa.get(1);
		System.out.println(ss);
		
		System.out.println(3+"1");
	}
}
