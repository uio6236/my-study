package com.kh.ex1;
// Thread 생성 방법 1) Runnable 인터페이스 구현
public class Task1 implements Runnable{
	@Override
	public void run() {
		// 스레드를 통해 실행할 내용
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "실행중!!!");
		
	}
}