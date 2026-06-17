package com.kh;
public class A_For {
	/*
	 * * 반복문 : 특정 코드를 반복적으로 수행하는 문법
	 * 
	 * * for 문
	 * [표현법]
	 * 		for (초기식; 조건식; 증감식) {
	 * 			// 반복적으로 실행할 내용
	 * 		}
	 * 
	 * * for 문 실행 순서
	 * 		초기식 -> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행 -> 증감식
	 * 				-> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행 -> 증감식
	 * 				....
	 * 				-> 조건식 검사 -> 결과가 false 인 경우 -> 반복문 종료
	 * 
	 * * 참고 : 초기식, 조건식, 증감식은 생략 가능!
	 *	 		=> 세미콜론(;)은 반드시 작성해야 함!!
	 *		- 증감식 생략 => for(초기식; 조건식; ) { }
	 *		- 조건식 생략 => for(초기식; ; 증감식) { }
	 *		- 초기식 생략 => for( ; 조건식; 증감식) { }
	 *		- 모두 생략 => for( ; ; ) { }
	 */
	public static void main(String[] args) {
		method6();
	}
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : Hello");
		}
		for (int i = 5; i > 0; i--) {
			System.out.println(i + " : Hello");
		}
	}
	public static void method2() {
		// 1부터 10까지 출력
		// 1 2 3 4 5 6 7 8 9 10
		// * 반복할 내용 => 출력한다!
		// 	 출력하는 내용이 1씩 증가되고 있음!
		//	 시작값 : 1, 끝값 : 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
	public static void method3() {
		// 1부터 10까지의 합
		System.out.print("");
		int sum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.printf("%d + %d = %d\n", sum, i, sum + i);
			sum += i;
		}
		System.out.print("1부터 10까지의 합 : " + sum);
	}
	public static void method4() {
		// 1부터 랜덤값 까지의 총 합
		
		/*
		 * [랜덤값 구하는 방법]
		 * - Math : java.lang.Math
		 * 		Math.random() 을 사용
		 * 			0.0 ~ 0.9999999 ( 0.0 <= 랜덤값 < 1.0 )
		 * - ex) 1부터 10까지 랜덤값 추출
		 * 		Math.random() * 10 => 0.0 ~ 9.99999..
		 * 		Math.random() * 10 + 1 => 1.0 ~ 10.99999..
		 * 		(int)(Math.random() * 10 + 1) => 1 ~ 10
		 */
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤값 : " + random);
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			System.out.printf("%d + %d = %d\n", sum, i, sum + i);
			sum += i;
		}
		System.out.print("1부터 " + random + "까지의 합 : " + sum);
	}
	public static void method5() {
		// 6단 출력
		int dan = 6;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
	}
	public static void method6() {
		// 1단 ~ 9단 모두 출력 프로그램
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, j * i);
			}
			System.out.println("");
		}
	}
}
