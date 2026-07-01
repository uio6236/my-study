package com.fish.view;
import java.util.ArrayList;
import java.util.Scanner;
import com.fish.controller.FishController;
import com.fish.model.FishInfo;

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
	public void fishAdd() {
		System.out.println("===== 물고기 정보 추가 =====");
		System.out.print("물고기 이름 : ");
		String name = sc.nextLine();
		System.out.print("낚시 시즌 : ");
		String season = sc.nextLine();
		System.out.print("주서식지 : ");
		String habitat = sc.nextLine();
		System.out.print("추천 미끼 : ");
		String bait = sc.nextLine();
		System.out.print("방생 기준 크기(cm) : ");
		int releaseSize = sc.nextInt();
		FishInfo fish = new FishInfo(name, season, habitat, bait, releaseSize);
		fc.addFish(fish);
		System.out.println("물고기 정보가 추가되었습니다.");
	}
	public void fishList() {
		System.out.println("===== 전체 물고기 정보 조회 =====");
		ArrayList<FishInfo> list = fc.getFishList();
		if(list.isEmpty()) {System.out.println("등록된 물고기 정보가 없습니다.");}
		else {
			for(FishInfo fish : list) {
				fish.fishInfoPrint();
				System.out.println("--------------------");
			}
		}
	}
	public void fishSearch() {
		System.out.println("===== 물고기 이름 검색 =====");
		System.out.print("검색할 물고기 이름 : ");
		String name = sc.nextLine();
		FishInfo fish = fc.searchFish(name);
		if(fish == null) {System.out.println("검색 결과가 없습니다.");}
		else {fish.fishInfoPrint();}
	}
	public void fishEdit() {
		System.out.println("===== 물고기 정보 수정 =====");
		System.out.print("수정할 물고기 이름 : ");
		String name = sc.nextLine();
		if(fc.searchFish(name) == null) {
			System.out.println("해당 물고기 정보가 없습니다.");
			return;
		}
		System.out.println("새로운 정보를 입력하세요.");
		System.out.print("물고기 이름 : ");
		String newName = sc.nextLine();
		System.out.print("낚시 시즌 : ");
		String season = sc.nextLine();
		System.out.print("주서식지 : ");
		String habitat = sc.nextLine();
		System.out.print("추천 미끼 : ");
		String bait = sc.nextLine();
		System.out.print("방생 기준 크기(cm) : ");
		int releaseSize = sc.nextInt();
		FishInfo fish = new FishInfo(newName, season, habitat, bait, releaseSize);
		if(fc.editFish(name, fish)) {System.out.println("물고기 정보가 수정되었습니다.");} 
		else {System.out.println("물고기 정보 수정에 실패했습니다.");}
	}
	public void fishDelete() {
		System.out.println("===== 물고기 정보 삭제 =====");
		System.out.print("삭제할 물고기 이름 : ");
		String name = sc.nextLine();
		if(fc.deleteFish(name)) {System.out.println("물고기 정보가 삭제되었습니다.");} 
		else {System.out.println("해당 물고기 정보가 없습니다.");}
	}
	public void fileSave() {
		fc.saveFile();
		System.out.println("파일 저장이 완료되었습니다.");
	}
	public void fileOpen() {
		fc.openFile();
		System.out.println("파일 불러오기가 완료되었습니다.");
	}
}