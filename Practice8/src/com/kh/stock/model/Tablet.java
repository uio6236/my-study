package com.kh.stock.model;

public class Tablet extends Device{
	private boolean supportStylus;
    public Tablet() {}
    public Tablet(String brand, String name, int price, boolean supportStylus){
        super(brand, name, price);
        this.supportStylus = supportStylus;
    }
	@Override
	public String getInformation() {
		String s = (supportStylus)?"지원함":"지원안함";
        return "[태블릿] " + super.getInformation() + "| 펜 지원 여부: " + s;
	}
    
}
