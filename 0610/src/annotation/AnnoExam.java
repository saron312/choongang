package annotation;

import java.lang.reflect.Method;

public class AnnoExam {
 public static void main(String[] args) {
	 long start = 0, end = 0;
	 start = System.currentTimeMillis(); // 시작
	 Method[] dms = Serv.class.getDeclaredMethods();
	 for (Method mt:dms) {
		 if(mt.isAnnotationPresent(prnAnno.class)) {
			 prnAnno pra = mt.getAnnotation(prnAnno.class);
			 System.out.println(mt.getName());
			 for(int i=0; i<pra.nnn();i++) {
				 System.out.print(pra.vvv());
			 }
			 System.out.println();
			 end = pra.ttt; //시각을 가져옴
			 try {
				 mt.invoke(new Serv());
				 System.out.println("수행시간:"+(end-start)+" ms"); //끝
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
	 }
 }
}
