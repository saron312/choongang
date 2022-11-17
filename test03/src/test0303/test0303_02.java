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
		z= x++; // z에 x를 대입시키고, x에 +1추가 따라서 z=12, x=13이 됨
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("----------------");
		
		z= ++x; // x에 +1추가하고 그 값을 z에 대입시킨다. 따라서 z = 14, x = 14임
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("----------------");
		
		z= ++x + y++;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
