package com.kh.ex3;
import java.util.Scanner;
public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			for(int i = n1; i <= n2; i++) {
				if (n1 < 1 || n2 < 1) {
					System.out.print("1 이상의 숫자를 입력해주세요.");
					break;
				}
				System.out.print(i + " ");
			}
		} else if (n1 > n2) {
			for(int i = n2; i <= n1; i++) {
				if (n1 < 1 || n2 < 1) {
					System.out.print("1 이상의 숫자를 입력해주세요.");
					break;
				}
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
