package student.model;

public class Student {
	private int id;
	private String studentName;
	private String password;
	private int korScore;
	private int mathScore;
	private int engScore;
	private String message;
	
	private int avgScore;
	private int sumScore;
	private int rank;
	private int korRank;
	private int mathRank;
	private int engRank;
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getKorRank() {
		return korRank;
	}

	public void setKorRank(int korRank) {
		this.korRank = korRank;
	}

	public int getMathRank() {
		return mathRank;
	}

	public void setMathRank(int mathRank) {
		this.mathRank = mathRank;
	}

	public int getEngRank() {
		return engRank;
	}

	public void setEngRank(int engRank) {
		this.engRank = engRank;
	}

	public int getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}

	public int getSumScore() {
		return sumScore;
	}

	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}



	public Student() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean hasPassword() {
		return password !=null && !password.isEmpty();
	}
	
	public boolean matchPassword(String pwd) {
		return password != null && password.equals(pwd);
	}
	
//	public int sumScore() {
//		return this.korScore+this.mathScore+this.engScore;
//	}
//	
//	public double avgScore() {
//		double result = Math.round(((double)sumScore()/3)*100)/100.0;
//		return result;
//	}

	
}
