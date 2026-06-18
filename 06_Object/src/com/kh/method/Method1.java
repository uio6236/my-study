package com.kh.method;

public class Method1 {
	/*
	 * * 메소드: 함수. 클래스 내에서 특정 기능을 묶어놓은 부분.
	 * 
	 * * 표현법 *
	 * 		접근제한자 예약어 반환형 메소드명(매개변수) {
	 *			// 실행할 내용
	 *		}
	 */
	public static void main(String[] args) {
		hi("apple");
		System.out.print(getRandom(10));
	}
	/**
	 * 매소드 실행 시 "HI Everyone!:;을 콘솔창에 출력
	 * 
	 * * main 메소드에서 호출할 예정!
	 */
	public static void hE() {
		System.out.println("Bye Everyoue!@@@");
	}
	/**
	 * 메소드 실행 시 이름(name)을 전달받아
	 * "안녕하세요 {name}님!"을 콘솔창에 출력
	 */
	public static void hi(String name) {
		System.out.printf("안녕하세요 %s님\n", name);
	}
	/**
	 * 메소드 실행 시 1 ~ 100 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom() {
		int i = (int)(Math.random() * 100 + 1);
		return i;
	}
	/**
	 * 메소드 실행 시 1부터 전달받은값(end) 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom(int num) {
		int i = (int)(Math.random() * num + 1);
		return i;
	}
}
