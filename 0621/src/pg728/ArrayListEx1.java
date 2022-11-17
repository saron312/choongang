package pg728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String °´Ã¼¸¦ ÀúÀå
		list.add("Aaa");
		list.add("Bbb");
		list.add("Ccc/Ddd");
		list.add(2,"Eee");
		list.add("Fff");
		
		//ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö ¾ò±â
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		System.out.println();
		
		//2¹ø ÀÎµ¦½ºÀÇ °´Ã¼ ¾ò±â
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		//ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
		for(int i =0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2); //2¹ø ÀÎµ¦½º  °´Ã¼(Database) »èÁ¦µÊ
		list.remove(2); //2¹ø ÀÎµ¦½º °´Ã¼(servlet/JSP) »èÁ¦µÊ
		list.remove("iBATIS");
		
		//ÀúÀåµÈ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
