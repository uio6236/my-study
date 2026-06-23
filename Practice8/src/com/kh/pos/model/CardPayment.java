package com.kh.pos.model;

public class CardPayment extends PaymentMethod {
    private boolean hasCashback;
    public CardPayment() {}
    public CardPayment(String name, int minAge, int transactionLimit, boolean hasCashback) {
    	super(name, minAge, transactionLimit);
        this.hasCashback = hasCashback;
    }
    
	public boolean isHasCashback() {return hasCashback;}
	@Override
	public String toString() {
		return "신용/체크카드 - 카드명: " + super.toString() + "| 캐시백 여부: "
                + ((hasCashback)?"캐시백 가능":"캐시백 없음");
	}
}