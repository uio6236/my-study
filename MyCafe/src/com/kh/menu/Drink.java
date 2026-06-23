package com.kh.menu;

public class Drink {
	private String name;
	private int price;

    public Drink(){}
    public Drink(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {return name;}
    public int getPrice() {return price;}
    public void order() {System.out.println("음료를 준비합니다.");}
}
