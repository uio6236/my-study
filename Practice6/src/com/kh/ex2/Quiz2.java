package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"사과", "딸기", "바나나", "키위", "복숭아"};
		System.out.print("찾을 과일의 이름을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		// 과일 목록에서 찾을 과일 찾기
		// => 배열에서 입력받은 값과 일치하는 항목 찾기!
		
		int fIndex = -1; // 일치하는 과일을 찾았을 경우 해당 인데스를 저장
		for(int i = 0; i < arr.length; i++) {
			boolean isEquals = arr[i].equals(fruit);
			if(isEquals) {
				fIndex = i;
				break;
			}
		}
		if(fIndex > -1) { // fIndex != -1
			System.out.println(fruit + "은 배열의 " + fIndex + "번 인덱스에 있습니다");
		} else {
			System.out.println("찾는 과일이 없습니다");
		}
		
	}
}
