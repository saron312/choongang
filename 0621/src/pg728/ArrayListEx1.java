package pg728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String ��ü�� ����
		list.add("Aaa");
		list.add("Bbb");
		list.add("Ccc/Ddd");
		list.add(2,"Eee");
		list.add("Fff");
		
		//����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü��: "+size);
		System.out.println();
		
		//2�� �ε����� ��ü ���
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		//����� �� ��ü ����ŭ ����
		for(int i =0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2); //2�� �ε���  ��ü(Database) ������
		list.remove(2); //2�� �ε��� ��ü(servlet/JSP) ������
		list.remove("iBATIS");
		
		//����� ��ü ����ŭ ����
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
