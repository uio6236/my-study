package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지불한 돈 : ");
		int money = sc.nextInt();
		System.out.print("물건 가격 : ");
		int price = sc.nextInt();
		
		int r = money - price;
		int p = r / 1000;
		int c = (r % 1000) / 100;
		
		System.out.println("지불한 돈 : " + money);
		System.out.println("물건 가격 : " + price);
		System.out.println("--- 거스름돈 내역 ---");
		System.out.println("천원 지폐 : " + p + "장");
		System.out.println("백원 동전 : " + c + "개");
		sc.close();
	}

}
