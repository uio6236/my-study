package com.kh.method;

public class Method2 {
	/*
	 * 메소드 오버로딩
	 * : 하나의 클래스 내에서 같은 이름의 여러 개의 메소드가 존재할 수 있는 특징
	 * : 조건) 매개변수의 개수, 타입, 순서가 달라야 함!
	 */
	public static void main(String[] args) {
		System.out.println(add(1, 3));
		System.out.println(add(1.2, 3.5));
	}
	/**
	 * add 메소드
	 * : 두 정수의 합을 반환하는 메소드
	 * 
	 * * 전달받아야 하는 값 => o. 2개 전달받아야 함!
	 * * 결과값 => o. 1개
	 */
	public static int add(int n1, int n2) {
		return (n1 + n2);
	}
	//	public static int add(int n1, int n2) {
	//		return (n1 + n2);
	//	}
	// 오버로딩이 적용되지 않은 이유?
	// 매개변수 정보(개수, 타입, 위치)가 동일하기 때문에.
	public static double add(double n1, double n2) {
		return (n1 + n2);
	}
}
