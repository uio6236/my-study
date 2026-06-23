package com.kh.pos.view;
import java.util.*;
import com.kh.pos.controller.PosController;
import com.kh.pos.model.Customer;
import com.kh.pos.model.PaymentMethod;

public class PosMenu {
    private PosController pc = new PosController();
    private Scanner sc = new Scanner(System.in);
    
    public void mainMenu() {
    	System.out.println("--- 자가 쇼핑 POS 등록 ---");
    	System.out.print("고객 이름 입력: ");
    	String name = sc.next();
    	System.out.print("고객 나이 입력: ");
    	int age = sc.nextInt();
    	pc.insertCustomer(new Customer(name, age));
    	sc.nextLine();
    	while(true) {
    		System.out.println("==== 스마트 POS 단말기 메뉴 ====");
        	System.out.println("1. 마이페이지 (멤버십 정보)\r\n"
        			+ "2. 전체 사용 가능 결제수단 조회\r\n"
        			+ "3. 결제수단 검색\r\n"
        			+ "4. 결제(구매)하기\r\n"
        			+ "9. 시스템 종료");
        	System.out.print("메뉴 번호: ");
        	int menu = sc.nextInt();
        	sc.nextLine();
        	switch(menu) {
        	case 1:
        		// 마이페이지 -> 고객 정보 출력
        		// * 고객 정보는 Controller 의 getCustomerInfo() 통해 반환
        		Customer customer = pc.getCustomerInfo();
        		//System.out.println(customer.toString());
        		System.out.println(customer);
        		break;
        	case 2:
        		// 전체 결제 수단 조회
        		printAllmethods();
        		break;
        	case 3:
        		// 결제수단 검색
        		searchMethod();
        		break;
        	case 4:
        		// 결제하기
        		
        		break;
        	case 9:
        		// 시스템 종료
        		return;
        	default:
        		System.out.println("존재하지 않는 메뉴입니다.");
        		break;
        	}
    	}
    }
    public void printAllmethods() {
    	PaymentMethod[] methods = pc.selectAllMethods();
		for(int i = 0; i < methods.length; i++) {
			System.out.println("[" + i + "번]" + methods[i]);
		}
    }
    public void searchMethod() {
    	System.out.print("검색할 결제 수단명 입력 : ");
    	String keyword = sc.nextLine();
    	PaymentMethod[] result = pc.searchMethod(keyword);
    	for(PaymentMethod method : result) {
    		if (method != null) {System.out.println(method);}
    	}
	}
	public void checkout() {
	
	}
}
