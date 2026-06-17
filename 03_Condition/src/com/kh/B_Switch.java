package com.kh;
import java.util.Scanner;
public class B_Switch {
	/*
	 * * 조건문 switch
	 * : 동등 비교를 통해 흐름을 제어
	 * 
	 * [표현법]
	 * 		switch (비교대상) {
	 * 			case 값1:
	 * 				// 비교대상 == 값1 일 때 실행할 내용
	 * 				break;
	 * 			case 값2:
	 * 				// 비교대상 == 값2 일 때 실행할 내용
	 * 				break;
	 * 			...
	 * 			default:
	 * 				// 모든 case에 해당하지 않을 때 실행할 내용
	 * 				break;
	 * 		}
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		/*
		 * 정수를 입력받아 아래 조건에 맞게 출력
		 * 
		 * 1: 빨간색 2: 노란색 3: 초록색 그 외: 검은색
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int color = sc.nextInt();
		switch (color) {
		case 1:
			System.out.print("빨간색");
			break;
		case 2:
			System.out.print("노란색");
			break;
		case 3:
			System.out.print("초록색");
			break;
		default:
			System.out.print("검은색");
			break;
		}
		sc.close();
	}
	public static void method2() {
		/*
		 * 사용자에게 2 개의 정수와 + 또는 -를 입력받아 연산 결과를 출력
		 * 단, + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
		 * 
		 * 입력 예시) 10 20 +
		 * 출력 예시) 10 + 20 = 30
		 * 입력 예시) 5 10 /
		 * 출력 예시) 5 / 10 = 입력이 잘못되었습니다. 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("다음과 같이 입력 시 연산 결과를 확인할 수 있습니다.");
		System.out.println("예) 10 20 + => 10+20=30 의 결과 확인");
		System.out.println(" : ");
		// 버퍼 :
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String strOp = sc.next();
		char op = strOp.charAt(0);
		switch (op) {
		case '+':
			int result = n1 + n2;
			System.out.printf("%d %c %d = %d\n", n1, op, n2, result);
			break;
		case '-':
			int result2 = n1 - n2;
			System.out.printf("%d %c %d = %d\n", n1, op, n2, result2);
			break;
		case '*':
			System.out.printf("n1 * n2 = " + (n1 * n2));
			break;
		case '/':
			System.out.printf("n1 / n2 = " + (n1 / n2));
			break;
		case '%':
			System.out.printf("n1 / n2 = " + (n1 % n2));
			break;
		default:
			String result3 = "입력이 잘못되었습니다.";
			System.out.printf("%d %c %d = %s\n", n1, op, n2, result3);
			break;
		}
		sc.close();
	}
}
