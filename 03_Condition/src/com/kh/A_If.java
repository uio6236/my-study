package com.kh;
import java.util.Scanner;
public class A_If {
	/*
	 * 기본적으로 프로그램은 순차적으로 실행 (위 -> 아래, 좌 -> 우)
	 * 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리 가능
	 * 
	 * * 조건문 if
	 * [1] 단독 if 문
	 * 		if (조건식) {
	 * 			// 조건식의 결과가 true 일 때 실행할 내용
	 * 		}
	 * [2] if ~ else 문
	 * 		if (조건식) {
	 * 			// 조건식의 결과가 true 일 때 실행할 내용
	 * 		} else {
	 * 			// 조건식의 결과가 false 일 때 실행할 내용
	 * 		}
	 * [3] if ~ else if ~ else 문
	 * 		if (조건식1) {
	 * 			// 조건식1의 결과가 true 일 때 실행
	 * 		} else if (조건식2) {
	 * 			// 조건식1의 결과가 false 이고, 조건식2의 결과가 true 일 때 실행할 내용
	 * 		} else {
	 * 			// 조건식1, 조건식2의 결과가 모두 false 일 때 실행
	 * 		}	
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 입력받은 값이 1 ~ 10 사이의 값이면 해당 값을 출력
		//						그렇지 않으면 "범위를 벗어났습니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10 사이의 값 입력 : ");
		int n = sc.nextInt();
		if (n>=1 && 10>=n) {
			System.out.print(n);
		} else {
			System.out.print("범위를 벗어났습니다");
		}
		sc.close();
	}
	public static void method2() {
		/*
		 * 주민번호를 입력 받아 성별을 출력 ("남자", "여자")
		 * 단, -를 포함하여 입력받은 길이가 14자리가 아닌 경우
		 * "잘못 입력되었습니다" 출력
		 * 
		 * * 문자열 길이 : 문자열.length()
		 * * 특정 위치의 한 문자만 추출 : 문자열.charAt(위치)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 (-포함) : ");
		String ssn = sc.nextLine(); // "000000-0000000"
		int num = ssn.length();
		char a = ssn.charAt(7);
		if (num == 14) {
			if (a == '1' || a == '3') {
				System.out.print("남자");
			} else if (a == '2' || a == '4'){
				System.out.print("여자");
			} else {
				System.out.print("성별이 없습니다.");
			}
		} else {
			System.out.print("잘못 입력되었습니다");
		}
		sc.close();
	}
}
