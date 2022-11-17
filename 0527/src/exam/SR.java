package exam;

public class SR {
	String name;
    int sKor;
    int sMath;
    int sEng;
    
    SR(String name, int sKor, int sMath, int sEng) {
    	this.name = name;
    	this.sKor = sKor;
    	this.sMath = sMath;
    	this.sEng = sEng;
    }
    
    int sum() {
    	return sKor + sMath + sEng;
    }
    
    double avg() {
    	return sum() / 3.0;
    }
    
    String eval() {
    	String s = "";
    	double val = avg();
    	
    	if (val >= 60 && sKor >= 40 && sMath >= 40 && sEng >= 40) {
    		return "�հ��� �����մϴ�!\n";
    	}
    	if (val < 60)   { s += "��� 60�� �̸�\n"; }
    	if (sKor < 40)  { s += "���� ����\n";     }
    	if (sMath < 40) { s += "���� ����\n";     }
    	if (sEng < 40)  { s += "���� ����\n";     }
    	return s + "���հ�!";
    }
}
