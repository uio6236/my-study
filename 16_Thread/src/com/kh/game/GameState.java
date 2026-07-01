package com.kh.game;

public class GameState {
	private final String[] words = {"thread", "happy", "interface", "abstract", "smile"};
	private int wordIndex = 0;
	private String targetWord = words[wordIndex];
	private int remainingTime = targetWord.length();
	private boolean isRunning = true;
	private int score = 0;
	/*
	 * * synchronized : 멀티 스레드 환경에서 하나의 객체를 공유할 때,
	 * 					스레드가 한 번에 하나씩만 메소드를 사용할 수 있도록 락을 거는 방법
	 * 	- 동시성 제어: 여러 스레드가 동시에 데이터를 변경하다가 망가지는 것을 방지
	 *  - 가시성 보장: 한 스레드가 특정 값을 변경했을 때, 
	 *  			다른 스레드에서 캐시(임시 보관함)로 저장된 이전 값이 아닌
	 *  			실제 메모리(RAM)의 최신 값을 읽도록 강제함
	 */
	// 타이머 역할을 하는 메소드
	public synchronized void decreaseTime() {
		if (!isRunning) {return;}
		// 제한시간 1 감소
		remainingTime--;
		// 게임 화면 출력
		System.out.println("\n".repeat(3));
		System.out.println("[점수: " + score + "] 남은 시간: " + remainingTime + "초");
		System.out.println(">> 제시어: " + targetWord);
		System.out.println("입력: ");
		// 타임 아웃 검사
		if (remainingTime <= 0) {
			System.out.println("\n 시간 초과! GAME OVER...");
			System.out.println("엔터를 입력하면 종료됩니다.");
			isRunning = false;
		}
	}
	// 답을 입력했을 때 검사하는 메소드
	public synchronized void checkAnswer(String input) {
		if (!isRunning) {return;}
		// 제시어와 입력값이 일치하는지 검사
		if (input.equals(targetWord)) {
			System.out.println(" 정답입니다 !!");
			score += 10;
			if (wordIndex == words.length) {wordIndex = 0;}
			targetWord = words[wordIndex++];
			remainingTime = targetWord.length();
		} else {
			System.out.println("오답 입니다 !! 다시 입력하세요.");
			System.out.println("입력: ");
		}
	}
	// getter : isRunning, score
	public synchronized boolean isGameRunning() {
		return isRunning;
	}
	public int getScore() {
		return score;
	}
}
