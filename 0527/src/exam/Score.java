package exam;

public class Score {
	//�ʵ�
	String name;
	int sKor;
	int sMath;
	int sEng;
	
	//������
	Score(String name, int sKor, int sMath, int sEng) {
		this.name = name;
		this.sKor = sKor;
		this.sMath = sMath;
		this.sEng = sEng;
	}

	
	//�޼ҵ�

	int sum() {
		return sKor + sMath + sEng;
	}
	
	double avg () {
		return sum()/3.0;
	}
	
	
}
