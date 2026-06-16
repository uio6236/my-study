package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		method1(num);
		sc.close();
	}
	public static void method1(int n) {
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.print("짝수다");
			} else {
				System.out.print("홀수다");
			}
		} else {
			System.out.print("양수만 입력해주세요");
		}
	}
	public static void method2(int n) {
		if (n > 0) {
			int a = n % 2;
			switch (a) {
			case 0:
				System.out.print("짝수다");
				break;
			case 1:
				System.out.print("홀수다");
				break;
			}
		} else {
			System.out.print("양수만 입력해주세요");
		}
	}
}
