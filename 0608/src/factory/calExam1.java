package factory;

public class calExam1 {

	public static void main(String[] args) {
		Calculator ca1 = new Plus();
		Calculator ca2 = new Minus(); //������
		
		ca1.execute(30,40);
		ca2.execute(30,40); //ĸ��ȭ �ʳ�
	}

}
