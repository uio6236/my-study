package com.kh.ex2;

public class NotEnoughBalanceException extends Exception{
	private int balance;
	private int withdrawalAmount;
	
	public NotEnoughBalanceException(String message, int balance, int withdrawalAmount) {
		super(message);
		this.balance = balance;
		this.withdrawalAmount = withdrawalAmount;
	}
	public int getShortfallAmount() {return withdrawalAmount - balance;}
	public int getBalance() {return balance;}
}