package vending22;

public class NoCoinState implements State {

	@Override
	public void increaseCoin(VendingMachine2 vm) {
	   vm.inceaseCoin(vm);
	   vm.changeState(new SelectableState());
	}

	@Override
	public void select(Products productId, VendingMachine2 vm) {
		System.out.println("NoCoin ป๓ลย");
	}


}
