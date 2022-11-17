package pg444;

public class BalanceInsuffException extends Exception{
	public BalanceInsuffException() {}
	public BalanceInsuffException(String message) {
		super(message);
	}
}
