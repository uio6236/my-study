package com.kh;

public class C_ArrayCopy {

	public static void main(String[] args) {
		deepCopy();
	}
	/**
	 * 얕은 복사 : 주소값(참조값)을 복사하는 방식
	 */
	public static void shallowCopy() {
		// int[] origin = new int[] {1, 2, 3, 4, 5};
		int[] origin = {1, 2, 3, 4, 5};
		System.out.println(" ==== 원본 배열 출력 ==== ");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		// 복사본 배열 선언 => 원본 배열의 자료형
		int[] copy = origin;
		System.out.println(" ==== 복사본 배열 출력 ==== ");
		// 복사본 배열(copy)의 값을 출력
		for(int a : copy) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// 복사본 배열(copy)의 세 번째 위치 값을 333으로 변경
		copy[2] = 333;
		System.out.println(" ==== 변경된 복사본 배열 출력 ==== ");
		for(int a : copy) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(" ==== 원본 배열 출력 ==== ");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
	}
	/**
	 * 깊은 복사 : 새로운 배열을 생성하여 원본 배열의 값을 복사하는 방식
	 */
	public static void deepCopy() {
		int[] origin = {1, 2, 3, 4, 5};
		// 복사본 배열 : 배열 선언 후 원본 배열의 크기만큼 생성
		int[] copy = new int[origin.length];
		System.out.println(" === 데이터 복사 전 copy 배열 === ");
		for(int a : copy) {
			System.out.print(a + " ");
		}
		System.out.println();
		// [1] 반복문(for) 사용하여 복사하기
		//		초기식에 선언한 변수를 인덱스로 활용!
		for(int i=0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		origin[0] = 999;
		System.out.println(" === 복사 후 copy 배열 === ");
		for(int a : copy) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(" ==== 원본 배열 출력 ==== ");
		for(int i : origin) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ----------------------------
		// System.arraycopy(원본배열명, 복사를시작할인덱스,
		//					복사본배열명, 복사본배열의시작인덱스, 복사할개수);
		// System.arraycopy(origin, 0, copy, 0, origin.length);
		// => 원본 배열의 처음 위치부터 복사본 배열에서도 첫번째 위치에
		//		원본 배열 크기만큼 데이터를 복사
		
		copy = new int[10];
		// 원본 데이터 => [999, 2, 3, 4, 5]
		// 복사 후 데이터 => [0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		System.arraycopy(origin, 2, copy, 4, 3);
		
		System.out.println(" ===== arraycopy 로 복사 ===== ");
		for(int n : copy) {
			System.out.print(n + " ");
		}
		
	}

}
