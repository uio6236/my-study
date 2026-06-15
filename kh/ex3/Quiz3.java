package com.kh.ex3;
import java.util.Scanner;
public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double cm = sc.nextFloat();
		
		String result = (age < 12 || cm < 130) ? "보호자 동반 필수" : "단독 탑승 가능";
		
		System.out.println("나이 : " + age);
		System.out.println("키 : " + cm);
		System.out.println(result);
		sc.close();
	}

}
