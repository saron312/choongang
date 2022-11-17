import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö:"+size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String el = it.next();
			System.out.println("\t"+el);
		}
	}
}
