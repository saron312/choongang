package pg444;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money)throws BalanceInsuffException{
		if(balance <money) {
			throw new BalanceInsuffException("�ܰ����: "+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}

}	
