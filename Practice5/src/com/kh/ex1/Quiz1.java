package com.kh.ex1;
import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
		for(int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
