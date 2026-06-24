package com.kh.ex1;

public class Chicken implements Animal{

	@Override
	public void move() {
		System.out.println("두 발로 걸어갑니다..");
	}

	@Override
	public void eat() {
		System.out.println("지렁이를 먹습니다...");
	}

	@Override
	public void makeSound() {
		System.out.println("꼬끼오~~~");
	}
}
