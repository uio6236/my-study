package com.kh.ex3;
import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int num = sc.nextInt();
		if (num >= 0 && num <= 100) {
			if (num >= 90) {
				System.out.print("A");
			} else if (num >= 80) {
				System.out.print("B");
			} else if (num >= 70) {
				System.out.print("C");
			} else {
				System.out.print("F");
			}
		} else {
			System.out.print("점수를 올바르게 입력해주세요.");
		}
		sc.close();
	}

}
