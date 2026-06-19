package com.kh.encapsulation;

public class Monster {
	// -- 필드 --
	private int hp; // 체력
	public Monster() {
		this.hp = 100;
	}
	// * 공격 당함 => 체력을 깎는 메소드 (hp 변수의 값을 감소)
	public void attack(int damage) {
		if (damage > 100) {
			System.out.println("공격 할 수 있는 값은 100 이하여야 합니다.");
			return;
		}
		this.hp -= damage;
	}
	// * 체력 확인 => 체력 값을 확인 메소드 (hp 변수의 값을 반환)
	public int getHp() {
		return this.hp;
	}
}
