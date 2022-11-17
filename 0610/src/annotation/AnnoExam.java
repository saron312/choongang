package annotation;

import java.lang.reflect.Method;

public class AnnoExam {
 public static void main(String[] args) {
	 long start = 0, end = 0;
	 start = System.currentTimeMillis(); // ����
	 Method[] dms = Serv.class.getDeclaredMethods();
	 for (Method mt:dms) {
		 if(mt.isAnnotationPresent(prnAnno.class)) {
			 prnAnno pra = mt.getAnnotation(prnAnno.class);
			 System.out.println(mt.getName());
			 for(int i=0; i<pra.nnn();i++) {
				 System.out.print(pra.vvv());
			 }
			 System.out.println();
			 end = pra.ttt; //�ð��� ������
			 try {
				 mt.invoke(new Serv());
				 System.out.println("����ð�:"+(end-start)+" ms"); //��
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
	 }
 }
}
