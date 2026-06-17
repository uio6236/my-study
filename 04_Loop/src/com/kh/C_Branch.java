package com.kh;

public class C_Branch {
	/*
	 * * 분기문
	 * 
	 * * - break : 제어문 내에서 사용 시 강제로 종료시키는 구문
	 * 
	 * * - continue : 반복문 내에서 사용 시 뒤의 문장들을 실행하지 않고(무시하고)
	 * 					for 문의 경우 [증감식],
	 * 					while 문의 경우 [조건식]으로 이동!!
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 1 ~ 100 사이의 랜덤값을 추출하여 출력
		// 단, 해당 값이 짝수일 경우 반복문 종료
		while (true) {
			int random = (int)(Math.random() * 100 + 1);
			if (random % 2 == 0) {
				System.out.println("\n반복문 종료 직전 값 : " + random);
				break;
			}
			System.out.print(random + " ");
		}
	}
	public static void method2() {
		// 1부터 100까지의 정수 중 3의 배수이거나 5의 배수를 제외한 총 합 구하기
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) continue;
			sum += i;
		}
		System.out.print("3의 배수이거나 5의 배수를 제외한 1부터 100까지의 정수 총 합 : " + sum);
	}
}
