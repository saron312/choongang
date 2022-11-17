package jsp_pg123;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

public class TestEx1 {

	public static void main(String[] args) {
		Vector<String> vv = new Vector<>();
		vv.add("È«±æµ¿");
		vv.add("È«±æ¼ø");
		vv.add("È«±æÃ¶");
		
		Stream<String> st = vv.stream();
		st.forEach(n -> System.out.println(n));
		
		System.out.println("---");
		
		Iterator<String> it = vv.iterator();
		while(it.hasNext()) {
			String ss=it.next();
			System.out.println(ss);
		}
		
		System.out.println("---");
		
		Enumeration<String> es = vv.elements();
		while(es.hasMoreElements()) {
			String ss=es.nextElement();
			System.out.println(ss);
		}
	}

}
