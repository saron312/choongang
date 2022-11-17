package exClass06;

import java.util.Scanner;

public class Ex06BankApp {
	private static final String String = null;
	private static Ex06[] arr = new Ex06[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------");
			System.out.print("����>>");
			
			int selectNo = scan.nextInt();
			
			if(selectNo ==1) {createAccount();}
			if(selectNo ==2) {accountList();}
			if(selectNo ==3) {deposit();}
			if(selectNo ==4) {withdraw();}
			if(selectNo ==5) {run=false;}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("���»���");
		System.out.println("----------------------");
		System.out.print("���� ��ȣ:");
		String ano = scan.next();
		
		System.out.print("������:");
		String owner = scan.next();
		
		System.out.print("�ʱ��Աݾ�:");
		int balance = scan.nextInt();
		
		Ex06 account = new Ex06(ano, owner, balance);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i] = account;
				System.out.println("���:���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("���¸��");
		System.out.println("----------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				System.out.print(arr[i].getAno()+"        ");
				System.out.print(arr[i].getOwner()+"        ");
				System.out.println(arr[i].getBalance());
			}
		}
	}
	
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("����");
		System.out.println("----------------------");
		
		System.out.print("���� ��ȣ:");
		String ano = scan.next();
		System.out.print("���ݾ�:");
		int money = scan.nextInt();
		
		Ex06 ex = findAccount(ano);
		if(ex == null) {
			System.out.println("���� ������");
			return;
		}
		ex.setBalance(ex.getBalance()+money);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	
	}
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("���");
		System.out.println("----------------------");
		
		System.out.print("���� ��ȣ:");
		String ano = scan.next();
		System.out.print("��ݾ�:");
		int money = scan.nextInt();
		
		Ex06 ex = findAccount(ano);
		if(ex == null) {
			System.out.println("���� ������");
			return;
		}
		ex.setBalance(ex.getBalance()-money);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	private static Ex06 findAccount(String ano){
		Ex06 ex = null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				String dbano = arr[i].getAno();
				if(dbano.equals(ano)) {
					ex = arr[i];
					break;
				}
			}
		}
		return ex;
	}
}
