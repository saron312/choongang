package exam;

public class exam0530 { //Ŭ���� ����
	//�ʵ� ����
	int ii;
	String ss; 
	boolean bb;
	
	//������ ����
	exam0530(){
		
	}
	exam0530 (int ii){
		this.ii = ii;
	}
	
	exam0530 (int ii,String ss){
		this.ii = ii;
		//this(ii); 
		this.ss=ss;
	} //������ �����ε�
	
	String getSS() {
		return this.ss; //this���� ����
	}
	
	void print() {
		System.out.println(this.ii);
		System.out.println(this.ss);
		System.out.println(this.bb);
		return; //���� �Ⱦ��� �ǹ̰� ���� ������ ���� �� �ʿ����
	}
	
	void setSS(String ss) {
		this.ss=ss;
	}
	
	static void svsv() {
		System.out.println("���� �޼ҵ�");
	}
	
	public static void main(String[] args) {
		 //������ ���� 
		//exam0530 aa = new exam0530(); //����Ʈ , �⺻ ������
		//exam0530 aa2 = new exam0530(300,"Good");
		
		//System.out.println(aa.ii);
		//System.out.println(aa.ss); //���� �޼ҵ�� �ٸ� Ŭ������ �־ ��, 
		//System.out.println(aa.bb);
		exam0530.svsv();
		//aa.print();
		//aa.ii = 100;
		//aa.ss = "Test";
		//aa.setSS("Test");
		//aa.print();
	    //aa.svsv();
		
	}
}
