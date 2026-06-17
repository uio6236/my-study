package com.kh;
import java.util.Scanner;
public class C_Logical {
	/*
	 * 논리 연산자 (이항 연산자)
	 * : 두 개의 논리값을 연산 (true/false)
	 * : 결과값도 논리값
	 * 
	 * * 종류 : && || 
	 * 
	 *   - A && B : A, B 모두 true 일 때만 true
	 *     true && true => true
	 *     true && false => false
	 *     false && true => false
	 *     false && false => false
	 *   - A || B : A 또는 B 둘 중 하나라도 true 면 true
	 *     true || true => true
	 *     true || false => true
	 *     false || true => true
	 *     false || false => false
	 *     
	 *   -----------------------------
	 *   SCE (단축평가)
	 *   * && 연산자 : 앞의 조건이 false 라면 뒤의 조건은 실행되지 않음!
	 *   * || 연산자 : 앞의 조건이 true 인 경우 뒤의 조건은 실행되지 않음!
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 입력받은 값이 1 ~ 10 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean result = (num >= 1) && (num <= 10);
		// => true 또는 false 로 결과 출력
		System.out.println("입력된 값은 1 ~ 10 사이의 값인가? " + result);
		boolean result2 = num < 1 || num > 10;
		System.out.println("입력된 값은 1 ~ 10 범위를 벗어나는가? " + result2);
		sc.close();
	}
	public static void method2() {
		// 입력받은 문자가 소문자인지 확인
		// 'a' : 97, 'z' : 122
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		boolean result = ((ch >= 97) && (ch <= 122));
		boolean result2 = ch >= 'a' && ch <= 'z';
		System.out.println("입력 받은 값이 소문자인가? " + result);
		System.out.println("입력 받은 값이 소문자인가? " + result2);
		sc.close();
	}
}
