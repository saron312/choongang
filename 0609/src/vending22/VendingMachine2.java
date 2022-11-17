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
      state.increaseCoin(this);  // ���� ��ü�� ����
   }
   
   public void select(Products productId) {
      state.select(productId, this);   // ���� ��ü�� ����
   }
   
   public void changeState(State newState) {
      this.state = newState;
   }
   
   public void inceaseCoin(VendingMachine2 vm) {
      System.out.println("������ �����Ǿ����ϴ�. ���� "+ ++this.coin + "���� ���ҽ��ϴ�.");
   }
   
   public void provideProduct(Products productId) {
      System.out.println(productId+"�� ���Խ��ϴ�.");
   }
   
   public void decreaseCoin() {
	   System.out.println("������ ���ҵǾ����ϴ�. ���� "+ --this.coin + "���� ���ҽ��ϴ�.");
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
