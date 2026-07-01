package com.kh.game;

import java.util.Scanner;

public class ConsoleView {
	public static void main(String[] args) {
		GameState state = new GameState();
		System.out.println("====== CONSOLE TAJA GAME ======");
		System.out.println("제한 시간 내에 단어를 입력해보세요!");
		System.out.println("-".repeat(30));
		
		// 스레드 추가
		Thread t1 = new Thread(()->{
			// 게임이 실행중인 상태 동안, 1초마다 타이머를 동작
			while(state.isGameRunning()) {
				try {
					Thread.sleep(1000);
					state.decreaseTime();
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		});
		t1.start(); // 스레드 실행
		// 메인 스레드에서 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		while(state.isGameRunning()) {
			String input = sc.nextLine();
			state.checkAnswer(input);
		}
		System.out.println("*============GAME END============*");
		System.out.println(" 획득한 총 점수는 " + state.getScore() + "점 입니다.");
	}
}
