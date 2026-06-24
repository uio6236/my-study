package com.kh.ex1;

public class Dog implements Animal, Baby{
	// * 오버라이딩 조건 : 메소드명 동일 / 매개변수 정보 동일 / 반환형 동일 
	@Override
	public void move() {
		System.out.println("네 발로 걸어갑니다...");
	}

	@Override
	public void eat() {
		System.out.println("고기를 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍~");
	}
}
