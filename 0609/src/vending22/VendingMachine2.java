package vending22;

public class VendingMachine2 {
   
   private State state;
   private int coin;
   
   
   public int getCoin() {
      return coin;
   }

   public void setCoin(int coin) {
	  this.coin = coin;
   }

   public VendingMachine2() {
      state = new NoCoinState(); 
   }
   
   public void insertCoin() {
      state.increaseCoin(this);  // 상태 객체에 위임
   }
   
   public void select(Products productId) {
      state.select(productId, this);   // 상태 객체에 위임
   }
   
   public void changeState(State newState) {
      this.state = newState;
   }
   
   public void inceaseCoin(VendingMachine2 vm) {
      System.out.println("코인이 증가되었습니다. 코인 "+ ++this.coin + "개가 남았습니다.");
   }
   
   public void provideProduct(Products productId) {
      System.out.println(productId+"가 나왔습니다.");
   }
   
   public void decreaseCoin() {
	   System.out.println("코인이 감소되었습니다. 코인 "+ --this.coin + "개가 남았습니다.");
   }
   
   public boolean hasNoCoin() {
	   if (coin > 0)
	      return false;
	   else
	      return true;
   }
   
   public void setSoldout(Products productId, VendingMachine2 vm) {
	   switch(productId) {
	   case COFFEE:
		   state = new CoffefSoldOut();
		   break;
	   default:
		   state = new SoldOut();
	      break;
	   }
	   
	   vm.changeState(state);
   }
}
