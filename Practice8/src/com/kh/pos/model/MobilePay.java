package com.kh.pos.model;

public class MobilePay extends PaymentMethod {
	private String payVendor;

	public MobilePay() {
	}

	public MobilePay(String name, int minAge, int transactionLimit, String payVendor) {
		super(name, minAge, transactionLimit);
		this.payVendor = payVendor;
	}

	@Override
	public String toString() {
		return "모바일페이 - 플랫폼: " + super.toString() + "| 제공사: " + payVendor;
	}
}