package state;

public class StateExam {
	public static void main(String[] args) {
		Context con = new Context();
		
		StartState st = new StartState (); 
		st.doAction(con); //���� ����
		System.out.println(con.getSt().toString());
		
		StopState st1 = new StopState (); 
		st1.doAction(con); //���� ����
		System.out.println(con.getSt().toString());
	}
}
