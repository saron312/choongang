package state;

public class StateExam {
	public static void main(String[] args) {
		Context con = new Context();
		
		StartState st = new StartState (); 
		st.doAction(con); //시작 상태
		System.out.println(con.getSt().toString());
		
		StopState st1 = new StopState (); 
		st1.doAction(con); //중지 상태
		System.out.println(con.getSt().toString());
	}
}
