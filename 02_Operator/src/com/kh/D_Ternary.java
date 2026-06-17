package com.kh;
import java.util.Scanner;
public class D_Ternary {
	/*
	 * 삼항연산자 (항이 3개인 연산자)
	 * 
	 * __ ? __ : __
	 * (조건식) ? (조건식의 결과가 true인 경우 사용할 값) : (조건식의 결과가 false인 경우 사용할 값) 
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 입력한 값이 x인 경우 "종료합니다" 출력
		//              그렇지 않으면 "계속 진행합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("아무거나 입력 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		
		String result = (ch == 'x' || ch == 'X') ? "종료합니다" : "계속 진행합니다";
		System.out.print(result);
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
		String result = "" + ((op == '+') ? n1 + n2 : 
							(op == '-') ? n1 - n2 : 
								("입력이 잘못되었습니다."));
		System.out.printf("%d %c %d = %s\n", n1, op, n2, result);
		sc.close();
	}
}
