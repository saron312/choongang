package test0303;

public class test0303_02 {
	public static void main (String[] args) {
		int x = 10;
		int y = 10;
		int z ;
		
		System.out.println("----------------");
		x++; 
		++x;
		System.out.println("x = "+x);
		
		System.out.println("----------------");
		y--;
		--y;
		System.out.println("y = "+y);
		
		System.out.println("----------------");
		z= x++; // z�� x�� ���Խ�Ű��, x�� +1�߰� ���� z=12, x=13�� ��
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("----------------");
		
		z= ++x; // x�� +1�߰��ϰ� �� ���� z�� ���Խ�Ų��. ���� z = 14, x = 14��
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("----------------");
		
		z= ++x + y++;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
