package vending22;

public class CoffefSoldOut implements State {

	@Override
	public void increaseCoin(VendingMachine2 vm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Products productId, VendingMachine2 vm) {
		vm.setCoin(0);
		System.out.println(productId+" ��ǰ�� ��� �����Ǿ� ������ ��� ��ȯ�մϴ�. ���� "+ vm.getCoin() + "���� ���ҽ��ϴ�.");
		
	}

}
