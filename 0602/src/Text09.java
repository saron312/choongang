import java.util.Scanner;

public class Text09 {
	 public static void main(String[] args) {
//		 String[] ani = {"사자","호랑이","토끼","여우","개","소"};
//		 int idx =-1;
//		 String find = "여우";
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
		 
		 System.out.print("동물수>>");
		 int nn = scan.nextInt();
		 ani = new String[nn];
		 scan.nextLine();
		 
		 for(int i=0; i<ani.length; i++) {
			 System.out.print("동물이름>");
			 String ss = scan.nextLine();
			 ani[i]=ss;
		 }
		 for(int i =0;i<ani.length;i++) {
			 System.out.println(ani[i]+" ");
		 }
		 System.out.println();
		
		 System.out.print("검색할 동물>");
		 find = scan.nextLine();
		 
		 for(int i=0;i<ani.length;i++) {
			 if(find.equals(ani[i])) { //find.equals(ani[i])
				 idx = i;
				 break;
			 }
		 }
		 
		 System.out.println(find+"는 "+idx+"인덱스");
	 }
}
