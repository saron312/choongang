package test;

public class Test12 {

	public static void main(String[] args) {
		// 2*1=2
		// 2*2=4
		// 2*3=6
		// 2*4=8
		// 2*5=10
		// 2*6=12
		// 2*7=14 //������ ���ϱ�, ���� 2�ܿ� ���� for�� �ϼ�
		
		for(int j=2;j<10;j++) {
			//System.out.println(j);
			for(int i = 1; i<10;i++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}

	}

}
