package vending1;

public class VendingMachine {
	public enum State {NOCOIN,SELECTABLE,SOLDOUT}
	public enum Products {COLA, COFFEE, CIDER}
	
	private State state = State.NOCOIN; //�ʱ�ȭ�� ������ ���� �ɷ� ��
	private int coin;
	
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	
	public void insertCoin() {
		 switch(state) {
		 case NOCOIN:
			 increaseCoin(coin);
			 state = State.SELECTABLE;
			 break;
		 case SELECTABLE:
			 increaseCoin(coin);
			 break;
		 default:
		 }
	}
	
	public void select(Products productld) {
		switch(state) {
		case NOCOIN:
			System.out.println("������ ��������.");
			break;
		case SELECTABLE:
			provideProduct(productld);
			decreaseCoin();
			if(hasNoCoin()) {
				state = State.NOCOIN;
			}
			break;
		case SOLDOUT:
			returnCoin();
			break;
		default:
		}
	}
	
	public void increaseCoin(int coin) {
		System.out.println("���� ����!����"+ (++this.coin) +"��");
	}
	public void decreaseCoin() {
		System.out.println("���� ����!����"+ (--this.coin) +"��");
	}
	public void provideProduct(Products productld) {
		System.out.println(productld +"�� ���Խ��ϴ�!");
	}
	public boolean hasNoCoin() {
		if(coin>0) {
			return false;
		}else {
			return true;
		}
	}
	public void setSoldout() {
		state = State.SOLDOUT;
	}
	public void returnCoin() {
		this.coin = 0;
		System.out.println("��ǰ ��� ����! ������ ��ȯ�մϴ�.");
	}
}
