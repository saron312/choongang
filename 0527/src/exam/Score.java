package exam;

public class Score {
	//필드
	String name;
	int sKor;
	int sMath;
	int sEng;
	
	//생성자
	Score(String name, int sKor, int sMath, int sEng) {
		this.name = name;
		this.sKor = sKor;
		this.sMath = sMath;
		this.sEng = sEng;
	}

	
	//메소드

	int sum() {
		return sKor + sMath + sEng;
	}
	
	double avg () {
		return sum()/3.0;
	}
	
	
}
