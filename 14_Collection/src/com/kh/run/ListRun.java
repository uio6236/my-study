package com.kh.run;
import com.kh.model.sort.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRun {
	// List : 순서가 있고, 중복 허용
	public static void main(String[] args) {
		// 선언 및 생성
		List<Student> list = new ArrayList<>();
		// 데이터 추가 (학생)
		list.add(new Student("apple", 20, 20.2));
		list.add(new Student("lemon", 22, 25.2));
		list.add(new Student("grape", 24, 30.2));
		// 저장된 데이터 크기 확인
		System.out.println("현재 저장된 학생 수 : " + list.size());
		// 학생 정보 출력
		for(Student s : list) {
			System.out.println(s);
		}
		// 첫번째 학생 정보 제거
		list.remove(0);
		System.out.println("현재 저장된 학생 수 : " + list.size());
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println("점수 내림차순으로 정렬 -----");
		// 데이터 정렬
		Collections.sort(list);
		for(Student s1 : list) {
			System.out.println(s1);
		}
	}
}