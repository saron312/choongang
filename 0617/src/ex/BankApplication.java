package ex;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����>");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� �����ϱ�
	private static void createAccount() {
		//�ۼ���ġ
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scan.nextLine();
		
		System.out.print("������: ");
		String owner = scan.nextLine();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scan.nextInt();
		
		Account2 acc2 = new Account2(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc2;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");
		for(int i=0;i<accountArray.length;i++) {
			Account2 acc = accountArray[i];
			if(accountArray[i] != null) {
				System.out.print(acc.getAno());
				System.out.print("     ");
				System.out.print(acc.getOwner());
				System.out.print("     ");
				System.out.print(acc.getBalance());
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
	}
	
	private static void withdraw() {
	}
	
//	private static Account findAccount(String ano) {
//		
//	}
	
	
	
	
}
