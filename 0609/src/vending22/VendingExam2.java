package vending22;

public class VendingExam2 {
   public static void main(String[] ar) {
	   VendingMachine2 vm = new VendingMachine2();
	   vm.select(Products.COLA);  // 콜라를 선택
	   vm.insertCoin();  // 동전 넣음. 금액은 동일하다고 가정
	   vm.insertCoin();
	   vm.select(Products.COLA);  // 콜라를 선택
	   vm.select(Products.CIDER);  // 사이다를 선택
	   vm.insertCoin();
	   vm.setSoldout(Products.COFFEE, vm);    // 기기가 스스로 제품의 소진여부를 센서로 파악했다고 가정
	   vm.select(Products.COFFEE);
   }
}
