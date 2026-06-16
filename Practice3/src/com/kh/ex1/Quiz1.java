package com.kh.ex1;
import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형 한 변의 길이 : ");
		int cm = sc.nextInt();
		
		int d = cm * 4;
		int n = cm * cm;
		
		System.out.println("정사각형 한 변의 길이 : " + cm);
		System.out.println("둘레의 길이 : " + d);
		System.out.println("넓이 : " + n);
		sc.close();
	}

}
