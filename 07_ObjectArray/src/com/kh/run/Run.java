package com.kh.run;
import java.util.Arrays;
import java.util.Scanner;

import com.kh.model.Student;
public class Run {
	/*
	 * * 객체 배열 : 여러 개의 객체를 저장하여 관리하는 구조
	 * 	!! 주의 !!
	 * 	: 배열을 생성(new 클래스명[크기])한다고 해서 실제 객체를 생성하는 것이 아니라
	 * 		객체의 주소를 담을 수 있는 참조 변수만 만들어짐! (기본값: null)
	 * 	- 선언 : 클래스명[] 변수명;
	 * 	- 할당(생성) : 변수명 = new 클래스명[배열크기];
	 * 	- 값 대입(객체 생성)
	 * 		변수명[인덱스] = new 생성자;
	 * 	- 초기화
	 * 		변수명 = { new 생성자, new 생성자, ... }
	 */
	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------");
		// * 학생 정보를 담을 객체 배열 선언 및 할당
		//	- 학생 클래스 (Student)
		// * 학생 객체 생성
		Student s1 = new Student();
		// * 학생 배열 생성
		Student[] sArr = new Student[3];
		sArr[0] = new Student("apple", 20, 70.0);
		sArr[1] = new Student("banana", 21, 83.5);
		sArr[2] = s1;
		sArr[2].setName("remon");
		s1.setAge(21);
		s1.setScore(50.5);
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i].printInfo();
		}
		// * 세번째 학생 정보 삭제
		sArr[2] = null;
		//sArr[2].printInfo(); => 객체가 제거되었는데 기능을 호출함
		//							NullPointerException 발생!!
		System.out.println("--------------------");
		// * 값을 입력받아 학생 정보 저장
		Scanner sc = new Scanner(System.in);
		Student[] sArr2 = new Student[2];
		// * 반복문을 사용
		for(int i = 0; i < sArr2.length; i++) {
			System.out.println("* 이름 : ");
			String name = sc.next();
			System.out.println("* 나이 : ");
			int age = sc.nextInt();
			System.out.println("* 점수 : ");
			double score = sc.nextDouble();
			// * i번째 위치에 입력받은 학생 정보로 객체를 생성
			sArr2[i] = new Student(name, age, score);
		}
		System.out.println("=== 학생 정보 ===");
		for(Student s : sArr2) {
			s.printInfo();
		}
	}
}
