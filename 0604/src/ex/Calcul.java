package ex;

public class Calcul {
 int plus (int x, int y) {
	 return x+y;
 }
 
 double avg(int x, int y) {
	 double sum = plus(x,y);
	 return sum/2;
 }
 
 void execute() {
	 double result = avg(7,10);
	 println("������: "+result);
 }
 
 void println(String mm) {
	 System.out.println(mm);
 }
}
