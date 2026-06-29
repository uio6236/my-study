package com.kh.ex2.model;

import java.time.LocalDateTime;

public class Customer {
	private String id;
	private int remainingTime;
	private boolean isCkeckedln;
	private LocalDateTime checklnTime;
	
	public Customer(String id) {
		super();
		this.id = id;
		// 오픈 보너스(30분)
		this.remainingTime = 30;
		this.isCkeckedln = false;
		this.checklnTime = null;
	}
	public String getId() {return id;}
	public int getRemainingTime() {return remainingTime;}
	public void setRemainingTime(int remainingTime) {this.remainingTime = remainingTime;}
	public boolean isCkeckedln() {return isCkeckedln;}
	public void setCkeckedln(boolean isCkeckedln) {this.isCkeckedln = isCkeckedln;}
	public LocalDateTime getChecklnTime() {return checklnTime;}
	public void setChecklnTime(LocalDateTime checklnTime) {this.checklnTime = checklnTime;}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
