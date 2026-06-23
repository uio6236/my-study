package com.kh.menu;

public class Americano extends Drink {
	public Americano(String name, int price){
        super(name, price);
    }
	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public int getPrice() {
		return super.getPrice();
	}
	@Override
    public void order(){
        System.out.println("에스프레소 샷을 추출하고 얼음을 채웁니다");
    }

}
