package exceptionex;

public class NotExistIDException extends Exception{
	public NotExistIDException () {}
	public NotExistIDException(String mm) {
		super(mm);
	}
}
