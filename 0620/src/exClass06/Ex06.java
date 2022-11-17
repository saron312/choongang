package exClass06;

public class Ex06 {
	private String ano;
	private int balance;
	private String owner;
	
	public Ex06(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	

}
