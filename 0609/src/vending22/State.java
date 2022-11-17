package vending22;

public interface State {
   public void increaseCoin(VendingMachine2 vm);
   public void select(Products productId, VendingMachine2 vm);
}
