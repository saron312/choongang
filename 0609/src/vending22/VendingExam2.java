package vending22;

public class VendingExam2 {
   public static void main(String[] ar) {
	   VendingMachine2 vm = new VendingMachine2();
	   vm.select(Products.COLA);  // �ݶ� ����
	   vm.insertCoin();  // ���� ����. �ݾ��� �����ϴٰ� ����
	   vm.insertCoin();
	   vm.select(Products.COLA);  // �ݶ� ����
	   vm.select(Products.CIDER);  // ���̴ٸ� ����
	   vm.insertCoin();
	   vm.setSoldout(Products.COFFEE, vm);    // ��Ⱑ ������ ��ǰ�� �������θ� ������ �ľ��ߴٰ� ����
	   vm.select(Products.COFFEE);
   }
}
