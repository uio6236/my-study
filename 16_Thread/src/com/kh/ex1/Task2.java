package com.kh.ex1;
// Thread 생성 방법 2) Thread 클래스 상속
public class Task2 extends Thread{

	@Override
	public void run() {
		// 스레드를 통해 실행할 내용
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "실행중@@@@");
	}
	
}
