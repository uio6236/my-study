package com.kh.basic;
/*
 * * 클래스 구조
 * 		접근제한자 class 클래스명 {
 * 			// 변수부 (필드부)
 * 			// : 데이터를 저장할 공간을 선언하는 부분
 * 			// 생성자부
 * 			// : 객체를 생성하기 위한 특별한 메소드를 정의하는 부분
 * 			// => 데이터를 초기화하기 위한 목적으로 정의
 * 			// 메소드부
 * 			// : 기능을 정의하는 부분
 * 		}
 */
public class Person {
	/*
	 * 추상화 해보기! => 객체를 어떻게 표현할 것인지 정리하는 과정!
	 * 
	 * "사람" 객체 설계
	 * [1] 떠오르는 것들을 나열해보기
	 * 		이름, 나이, 성별, 직업, 국적, ...
	 * [2] 필요한 항목들만 추려내기
	 * 		이름, 나이, 성별, 말하다, 울다
	 * [3] 저장할 데이터의 형태를 정리해보기
	 * 		* 이름 => 문자열 ( String )
	 * 		* 나이 => 정수 ( int )
	 * 		* 성별 => 문자 ( char, 'M'/'F')
	 */
	String name;
	int age;
	char gender;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
