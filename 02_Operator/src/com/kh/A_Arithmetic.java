package com.kh;

public class A_Arithmetic {
	/*
	 * 산술 연산자 (이항 연산자) => + - * / %
	 * 
	 * 우선 순위 : * / % > + -
	 */
	public static void main(String[] args) {
		method2();
	}
	public static void method1() {
		// 10, 3 값을 각각 n1, n2 변수에 저장
		int n1 = 10;
		int n2 = 3;
		
		// n1, n2의 합, 차, 곱, 몫, 나머지 출력
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
	}
	public static void method2() {
		int a = 5; // 7
		int b = 10; // 9
		
		int c = ++a + b; // c => 16 (15)
		int d = c / a; // 2 (1)
		int e = c % a; // 4 (6)
		int f = e++; // 4 (5) (4)
		int g = --b + d--; // 9 + 2 (1) (10)
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); // 12
		// => d, e, f, g, h, i
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}
