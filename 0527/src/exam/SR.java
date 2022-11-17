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
    		return "합격을 축하합니다!\n";
    	}
    	if (val < 60)   { s += "평균 60점 미만\n"; }
    	if (sKor < 40)  { s += "국어 과락\n";     }
    	if (sMath < 40) { s += "수학 과락\n";     }
    	if (sEng < 40)  { s += "영어 과락\n";     }
    	return s + "불합격!";
    }
}
