package miniproject1;

import java.io.IOException;

public interface ReserveMovie {
	String id [] = {"sung" , "jang", "jeonog"};
	String password = "1234";
	
	public void logIn(); 
	public void selectMovie();
	public void reserveDate();
	public void reserveTime();
	public void reserveTicket() throws InterruptedException, IOException; 
	public void cinemaCancel(); 
	public void checkSeat() throws InterruptedException, IOException; 
	public void close();
	
}