package vending1;

import vending1.VendingMachine.Products;

public class VendingExam1 {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.select(Products.COLA);
		vm.insertCoin();
		vm.insertCoin();
		vm.select(Products.COLA);
		vm.select(Products.CIDER);
		vm.insertCoin();
		vm.setSoldout();  //��ǰ ����!
		vm.select(Products.COFFEE);
	}

}
