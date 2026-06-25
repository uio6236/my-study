package com.kh.ex2;

public class BankAccount {
	private int balance;
	
	public BankAccount(int initialbalance) {this.balance = initialbalance;}
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) throws NotEnoughBalanceException{
		if (amount > balance) {
			throw new NotEnoughBalanceException("[출금 오류 발생] 잔액이 부족합니다."
					, balance, amount);
		}
		balance -= amount;
		System.out.println("출금 완료! 남은 잔액: " + balance + "원");
	}
}