package com.kh.run;
import com.kh.menu.*;
public class Run {

	public static void main(String[] args) {
		Drink[] arr = new Drink[2];
        arr[0] = new Americano("아메리카노", 2000);
        arr[1] = new Latte("라떼", 3000);

        System.out.println("======= My Cafe =====================");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("[%s] 가격: %d원\n", arr[i].getName(), arr[i].getPrice());
            arr[i].order();
        }
	}

}
