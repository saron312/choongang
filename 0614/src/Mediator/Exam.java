package Mediator;

public class Exam {

	public static void main(String[] args) {
		User u1 = new User("Ã¶¼ö");
		User u2 = new User("¿µÈñ");
		u1.sendMsg("¾È³ç, ³ª¾ß!");
		u2.sendMsg("Á¡½É ¶§ º¸ÀÚ");
	}

}
