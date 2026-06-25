package com.kh.ex2;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 신한은행 출금 시스템 ===");
		BankAccount b = new BankAccount(10000);
		System.out.println("현재 잔액: " + b.getBalance());
		System.out.print("출금 시도 금액: ");
		int num = sc.nextInt();
		try {
			b.withdraw(num);
		} catch (NotEnoughBalanceException e){
			System.out.println(e.getMessage());
			System.out.println("부족한 금액: " + e.getShortfallAmount());
		} finally {
			System.out.println("=== 거래가 종료되었습니다 ===");
		}
	}
}
