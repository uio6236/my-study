package com.kh.ex2.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.ex2.controller.StudyCafeController;

public class StudyCafeView {
	private Scanner sc;
	private StudyCafeController controller;
	
	public StudyCafeView() {
		sc = new Scanner(System.in);
		controller = new StudyCafeController();
	}
	public void runApp() {
		while(true) {
			System.out.println("=== 스터디 카페 키오스크 ===");
			System.out.println("1. 입실 | 2. 퇴실 | 3. 등록 | 4. 조회 | 0. 시스템 종료");
			System.out.println("메뉴 선택: ");
			/*
			int menu = sc.nextInt();
			sc.nextLine();
			*/
			int menu = readInt();
			switch (menu) {
			case 1:
				System.out.println("회원 번호를 입력하세요 : ");
				String id = sc.nextLine();
				System.out.println(controller.checkln(id));
				break;
			case 2:
				System.out.println("회원 번호를 입력하세요 : ");
				String id2 = sc.nextLine();
				System.out.println(controller.checkOut(id2));
				break;
			case 3:
				System.out.println("[등록] 신규 회원 번호를 입력하세요: ");
				String newId = sc.nextLine();
				System.out.println(controller.registerCustomer(newId)); 
				break;
			case 4:
				System.out.println("조회할 회원 번호를 입력하세요: ");
				String searchId = sc.nextLine();
				System.out.println(controller.getCustomerInfo(searchId));
				break;
			case 0:
				System.out.println("[안내] 시스템을 종료합니다. 이용해 주셔서 감사합니다.");
				return;
			default:
				System.out.println("[안내] 잘못 입력하셨습니다. 0~4번 메뉴를 선택해 주세요.");
				break;
			}
		}
	}
	private int readInt() {
		// MismatchException.. 에외가 발생하지 않은 경우, 반복문 종료
		int menu = -1;
		/*
		while(true) {
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("올바른 메뉴를 선택하세요: ");
				sc.nextLine();
				// e.printStackTrace();
				continue;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		*/
		while(!sc.hasNextInt()) {
			System.out.println("올바른 메뉴를 선택하세요: ");
			sc.next();
		}
		menu = sc.nextInt();
		sc.nextLine();
		return menu;
	}
}
