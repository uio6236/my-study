package com.fish.view;
import java.util.Scanner;
import com.fish.controller.FishController;

public class FishView {
	private Scanner sc = new Scanner(System.in);
	private FishController fc = new FishController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("======물고기 정보 관리 프로그램======");
			System.out.println("1. 물고기 정보 추가");
			System.out.println("2. 물고기 정보 조회");
			System.out.println("3. 물고기 이름 검색");
			System.out.println("4. 물고기 정보 수정");
			System.out.println("5. 물고기 정보 삭제");
			System.out.println("6. 파일 저장");
			System.out.println("7. 파일 불러오기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				fishAdd();
				break;
			case 2:
				fishList();
				break;
			case 3:
				fishSearch();
				break;
			case 4:
				fishEdit();
				break;
			case 5:
				fishDelete();
				break;
			case 6:
				fileSave();
				break;
			case 7:
				fileOpen();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("올바른 메뉴를 입력하세요.");
				break;
			}
		}
	}
	public void fishAdd() {}
	public void fishList() {}
	public void fishSearch() {}
	public void fishEdit() {}
	public void fishDelete() {}
	public void fileSave() {}
	public void fileOpen() {}
}