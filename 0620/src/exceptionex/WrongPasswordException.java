package exceptionex;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String mm) {
		super(mm);
	}
}
