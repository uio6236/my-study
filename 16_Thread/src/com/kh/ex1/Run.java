package com.kh.ex1;

public class Run {
	public static void main(String[] args) {
		System.out.println(" ---- 메인 스레드 시작 ---- ");
		// * Runnable 인터페이스를 통해 구현한 스레드
		Thread t1 = new Thread(new Task1());
		t1.start();
		Thread t3 = new Thread(()->{
			// 스레드를 통해 실행할 내용
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "실행중###");
		});
		t3.start();
		// 람다식 적용한 버전
		// => 람다식 적용 조건: 함수형 인터페이스 (추상 메소드가 단 1개인 인터페이스)
		// * Thread 클래스를 상속시킨 스레드
		Thread t2 = new Task2();
		t2.start();
		System.out.println(" ---- 메인 스레드 종료 ---- ");
	}
}