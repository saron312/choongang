package test;

public class Test07 {
	public static void main(String[] args) {
		//int sc=168;
		int sc = (int)(Math.random()*20)+61;
		String ss = "";
		
		if(sc>100 || sc<0) {
			//System.out.println("�Է¿���");
			ss="�Է¿���";
		}else {
			if(sc>=90) {
				ss="��";
				
			}else if(sc>=80) {
				ss="��";
			}else if(sc>=70) {
				ss="��";
			}else if(sc>=60) {
				ss="��";
			}else if(sc>=50) {
				ss="��";
			}
		}
		System.out.println(sc+"�� - "+ss);
	}

}
