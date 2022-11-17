package strategy;

public class StrategyExam {
	public static void main(String[] args) {
		Strategy st = new OpAdd();
		Context con = new Context(st);
		System.out.println(con.execute(10,20));
		
		con = new Context(new OpSub());
		System.out.println(con.execute(10,20));
		
		con = new Context(new OpMulti());
		System.out.println(con.execute(10,20));
		
		con = new Context(new OpDiv());
		System.out.println(con.execute(200.0,15.0));
		
		
	}
}
