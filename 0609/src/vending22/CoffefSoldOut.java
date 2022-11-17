package vending22;

public class CoffefSoldOut implements State {

	@Override
	public void increaseCoin(VendingMachine2 vm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Products productId, VendingMachine2 vm) {
		vm.setCoin(0);
		System.out.println(productId+" 제품이 모두 소진되어 동전을 모두 반환합니다. 코인 "+ vm.getCoin() + "개가 남았습니다.");
		
	}

}
