import java.io.IOException;

public class ReserveExam {
	public static void main(String[] args) throws InterruptedException, IOException {
//		Ab ab = new Ab();
//		ab.st();
		LogIn logIn = new LogIn();
		SelectMovie selectMV = new SelectMovie();
//		ReserveTicket rt = new ReserveTicket();
//		String[][] seat = new String[5][5];
		
		Close close = new Close();

		logIn.logIn();
		selectMV.selectStart();
//		rt.reserveTicket(seat);

	}

	// class Ab{
	//
	//
	// void st() throws InterruptedException, IOException {
	// log.logIn();
	// sm.selectMovie();
	//
	// }
}
