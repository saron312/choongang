  package test03;

public class test03_03 {
	public static void main(String[] args) {
		//�Ǽ��� ����
		double var1 = 3.14;
		//float var2 = 3.14; //������ ������, float�� ���������� double���� ���� (4,8����Ʈ)�� ���ؼ� float�� �� �ڿ��� f,F�� �ٿ�����Ѵ�
		float var3=3.14F; 
		
		//���е� �׽�Ʈ
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1 : "+var1);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("------------");
		
		//e����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 234e-3;
		
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
		System.out.println("------------");
		
		System.out.println(var6==var7);
		System.out.println(var6==var8);
		System.out.println(var9==0.234);

	}

}
