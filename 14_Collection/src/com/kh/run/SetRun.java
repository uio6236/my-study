package com.kh.run;
import java.util.HashSet;
import java.util.Set;
import com.kh.model.set.Student;

public class SetRun {
	// Set : 순서가 없고, 중복이 허용되지 않음
	public static void main(String[] args) {
		// 선언 및 생성
		Set<Student> set = new HashSet<>();
		// 데이터 추가 (학생)
		set.add(new Student("apple", 20, 20.2));
		set.add(new Student("lemon", 22, 25.2));
		set.add(new Student("bananan", 23, 49.2));
		set.add(new Student("apple", 20, 20.2));
		// 저장된 데이터 크기 확인
		System.out.println("현재 저장된 학생 수 : " + set.size());
		// 학생 정보 출력
		for(Student s : set) {
			System.out.println(s);
		}
	}
}
