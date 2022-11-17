package exam;

public class exam0530 { //클래스 선언
	//필드 선언
	int ii;
	String ss; 
	boolean bb;
	
	//생성자 선언
	exam0530(){
		
	}
	exam0530 (int ii){
		this.ii = ii;
	}
	
	exam0530 (int ii,String ss){
		this.ii = ii;
		//this(ii); 
		this.ss=ss;
	} //생성자 오버로딩
	
	String getSS() {
		return this.ss; //this생략 가능
	}
	
	void print() {
		System.out.println(this.ii);
		System.out.println(this.ss);
		System.out.println(this.bb);
		return; //쓰나 안쓰나 의미가 없기 때문에 굳이 쓸 필요없음
	}
	
	void setSS(String ss) {
		this.ss=ss;
	}
	
	static void svsv() {
		System.out.println("정적 메소드");
	}
	
	public static void main(String[] args) {
		 //생성자 선언 
		//exam0530 aa = new exam0530(); //디폴트 , 기본 생성자
		//exam0530 aa2 = new exam0530(300,"Good");
		
		//System.out.println(aa.ii);
		//System.out.println(aa.ss); //메인 메소드는 다른 클래스에 넣어도 됨, 
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
