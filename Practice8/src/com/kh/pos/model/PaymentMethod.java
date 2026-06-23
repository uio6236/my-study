package com.kh.pos.model;

public class PaymentMethod {
    protected String name;
    protected int minAge;
    protected int transactionLimit;

    public PaymentMethod(){super();}
    public PaymentMethod(String name, int minAge, int transactionLimit){
        
    	this.name = name;
        this.minAge = minAge;
        this.transactionLimit = transactionLimit;
    }
    public String getName() {return name;}
    public int getMinAge() {return minAge;}
	@Override
	public String toString() {
		return String.format("%s, 제한연령: %d세, 한도: %d원 ", name, minAge, transactionLimit);
	}
}