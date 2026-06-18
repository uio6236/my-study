package com.kh.ex1;
import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0;
		int sum = 0;
		double ag = 0;
		while(i < arr.length) {
			System.out.printf("%d번 학생 점수 입력 : ", i + 1);
			int num = sc.nextInt();
			arr[i] = num;
			i++;
		}
		for(int a : arr) {
			sum += a;
		}
		System.out.printf("총합 : %d점", sum);
		System.out.println();
		System.out.printf("평균 : %.1f점", (double)(sum / arr.length));
		sc.close();
	}
}
