
public class CalculExam {
	public static void main(String[] args) {
		Calcul myCal = new Calcul();
		
		//���簢�� ���� ���ϱ�
		double result1 = myCal.areaRect(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCal.areaRect(10,20);
		
		System.out.println("���簢���� ����: "+result1);
		System.out.println(myCal.areaRect(10));
		System.out.println("���簢���� ����: "+result2);
		System.out.println(myCal.areaRect(20,20));
	}
}
