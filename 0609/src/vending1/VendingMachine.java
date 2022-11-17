package vending1;

public class VendingMachine {
	public enum State {NOCOIN,SELECTABLE,SOLDOUT}
	public enum Products {COLA, COFFEE, CIDER}
	
	private State state = State.NOCOIN; //초기화를 코인이 없는 걸로 함
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
			System.out.println("동전을 넣으세요.");
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
		System.out.println("코인 증가!코인"+ (++this.coin) +"개");
	}
	public void decreaseCoin() {
		System.out.println("코인 감소!코인"+ (--this.coin) +"개");
	}
	public void provideProduct(Products productld) {
		System.out.println(productld +"가 나왔습니다!");
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
		System.out.println("제품 모두 소진! 동전을 반환합니다.");
	}
}
