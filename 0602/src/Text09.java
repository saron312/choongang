import java.util.Scanner;

public class Text09 {
	 public static void main(String[] args) {
//		 String[] ani = {"����","ȣ����","�䳢","����","��","��"};
//		 int idx =-1;
//		 String find = "����";
//		 
//		 for(int i=0;i<ani.length;i++) {
//			 if(find.equals(ani[i])) { //find.equals(ani[i])
//				 idx = i; 
//			 }
//		 }
		 
		 String[] ani ;
		 int idx = -1;
		 String find = null;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("������>>");
		 int nn = scan.nextInt();
		 ani = new String[nn];
		 scan.nextLine();
		 
		 for(int i=0; i<ani.length; i++) {
			 System.out.print("�����̸�>");
			 String ss = scan.nextLine();
			 ani[i]=ss;
		 }
		 for(int i =0;i<ani.length;i++) {
			 System.out.println(ani[i]+" ");
		 }
		 System.out.println();
		
		 System.out.print("�˻��� ����>");
		 find = scan.nextLine();
		 
		 for(int i=0;i<ani.length;i++) {
			 if(find.equals(ani[i])) { //find.equals(ani[i])
				 idx = i;
				 break;
			 }
		 }
		 
		 System.out.println(find+"�� "+idx+"�ε���");
	 }
}
