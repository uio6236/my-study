package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.print("짝수다");
			} else {
				System.out.print("홀수다ㅣ");
			}
		} else {
			System.out.print("양수만 입력해주세요");
		}
		sc.close();
	}

}
