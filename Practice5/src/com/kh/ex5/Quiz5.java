package com.kh.ex5;
import java.util.Scanner;
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
