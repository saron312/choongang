package template;

public class GameEx {
	public static void main(String[] args) {
		Game gm = new Cricket();
		gm.play();
		gm = new Football();
		gm.play();
	}
}
