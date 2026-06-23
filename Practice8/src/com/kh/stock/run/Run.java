package com.kh.stock.run;
import com.kh.stock.model.*;
import com.kh.stock.model.Tablet;
public class Run {

	public static void main(String[] args) {
		Device[] arr = new Device[3];
        arr[0] = new SmartPhone("Apple", "iphone", 1250000, "iOS");
        arr[1] = new SmartPhone("Galaxy S24", "Samsung", 1150000, "Android");
        arr[2] = new Tablet("Galaxy Tab S9", "Samsung", 980000, true);
        
        System.out.println("=== 매장 보유 디바이스 재고 목록 ===");
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i].getInformation());
        }
	}
}
