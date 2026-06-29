package com.kh.ex1;

import java.time.LocalDate;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		mine();
	}
	public static void mine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력:");
		String num = sc.nextLine();
		int thisYear = LocalDate.now().getYear();
		//System.out.println(thisYear);
		String n = num.substring(0, 2);
		int age = 0;
		char gender = num.charAt(7);
		String sex = "";
		//System.out.println(gender);
		if (gender == '1' || gender == '3') {
			if (gender == '1') {age = thisYear - (Integer.parseInt(n)+1900);} 
			else {age = thisYear - (Integer.parseInt(n)+2000);} 
			sex = "남성";
		} else if (gender == '2' || gender == '4') {
			if (gender == '2') {age = thisYear - (Integer.parseInt(n)+1900);} 
			else {age = thisYear - (Integer.parseInt(n)+2000);} 
			sex = "여성";
		} else {
			sex = "잘못된 성별";
		}
		System.out.printf("%s년생 출생 / 성별: %s / 나이: %d세", n, sex, age);
	}
	public static void example() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력:");
		String ssn = sc.nextLine();
		if(ssn.length() != 14) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			String result = "";
			String ssnYear = ssn.substring(0, 2);
			char gender = ssn.charAt(7);
			int birthyear = 0;
			if (gender == '1' || gender == '2') {
				birthyear = (1900 + Integer.parseInt(ssnYear));
			} else if (gender == '3' || gender == '4') {
				birthyear = (2000 + Integer.parseInt(ssnYear));
			}
			result = birthyear + "년생 출생";
			if (gender == '1' || gender == '3') {
				result += " / 성별: 남성 "; 
			} else if (gender == '2' || gender == '4') {
				result += " / 성별: 여성 "; 
			}
			int currYear = LocalDate.now().getYear();
			int age = currYear - birthyear;
			result += " / 나이: " + age + "세";
			System.out.println(result);
		}
	}
}
