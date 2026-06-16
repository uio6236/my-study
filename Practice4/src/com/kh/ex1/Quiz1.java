package com.kh.ex1;
import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.print("입력 메뉴입니다.");
			break;
		case 2:
			System.out.print("수정 메뉴입니다.");
			break;
		case 3:
			System.out.print("조회 메뉴입니다.");
			break;
		case 4:
			System.out.print("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.print("프로그램을 종료합니다.");
			break;
		default :
			System.out.print("잘못된 메뉴 번호입니다.");
			break;
		}
		sc.close();
	}

}
