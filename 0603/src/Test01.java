

public class Test01 {

	public static void main(String[] args) {
		String[] animals = {"����","��","�䳢","ȣ����"};
		//for(Ÿ�� �̸�:�迭�� �̸�){}
		for(String ani:animals) {
			System.out.println(ani);
		}
		
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println(animals); //�޸� �ּҰ��� ����
	}

}
