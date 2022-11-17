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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>>");
			
			int selectNo = scan.nextInt();
			
			if(selectNo ==1) {createAccount();}
			if(selectNo ==2) {accountList();}
			if(selectNo ==3) {deposit();}
			if(selectNo ==4) {withdraw();}
			if(selectNo ==5) {run=false;}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------");
		System.out.print("계좌 번호:");
		String ano = scan.next();
		
		System.out.print("계좌주:");
		String owner = scan.next();
		
		System.out.print("초기입금액:");
		int balance = scan.nextInt();
		
		Ex06 account = new Ex06(ano, owner, balance);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i] = account;
				System.out.println("결과:계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("계좌목록");
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
		System.out.println("예금");
		System.out.println("----------------------");
		
		System.out.print("계좌 번호:");
		String ano = scan.next();
		System.out.print("예금액:");
		int money = scan.nextInt();
		
		Ex06 ex = findAccount(ano);
		if(ex == null) {
			System.out.println("계좌 없음당");
			return;
		}
		ex.setBalance(ex.getBalance()+money);
		System.out.println("결과: 예금이 성공되었습니다.");
	
	}
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("출금");
		System.out.println("----------------------");
		
		System.out.print("계좌 번호:");
		String ano = scan.next();
		System.out.print("출금액:");
		int money = scan.nextInt();
		
		Ex06 ex = findAccount(ano);
		if(ex == null) {
			System.out.println("계좌 없음당");
			return;
		}
		ex.setBalance(ex.getBalance()-money);
		System.out.println("결과: 출금이 성공되었습니다.");
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
