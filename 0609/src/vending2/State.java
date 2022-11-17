package vending2;

public interface State {
	public void increaseCoin(VendingMachine2 vm);
	public void selec(Products product, VendingMachine2 vm);
}
