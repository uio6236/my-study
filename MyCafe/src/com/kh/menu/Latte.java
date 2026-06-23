package com.kh.menu;

public class Latte extends Drink{
    public Latte(String name, int price){
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
        System.out.println("에스프레소 샷을 추출하고 우유를 채웁니다");
    }
}
