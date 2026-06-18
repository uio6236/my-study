package com.kh.ex4;
public class Quiz4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		int n2 = 0;
		int n1 = 0;
		for(int i=0; i < arr.length; i ++) {
			if (arr[i] % 2 == 0) {
				n2++;
			} else {
				n1++;
			}
		}
		System.out.println("짝수의 개수 : " + n2);
		System.out.print("홀수의 개수 : " + n1);
	}
}
