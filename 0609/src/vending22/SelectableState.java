package vending22;

public class SelectableState implements State {

	@Override
	public void increaseCoin(VendingMachine2 vm) {
		vm.inceaseCoin(vm);
		
	}

	@Override
	public void select(Products productId, VendingMachine2 vm) {
		vm.provideProduct(productId);
		vm.decreaseCoin();
		
		if (vm.hasNoCoin())
			vm.changeState(new NoCoinState());
	}

}
