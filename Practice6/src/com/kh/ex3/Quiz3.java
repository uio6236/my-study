package com.kh.ex3;
public class Quiz3 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
		int min;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int a = arr[min];
			arr[min] = arr[i];
			arr[i] = a;
		}
		System.out.println();
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
	}
}
