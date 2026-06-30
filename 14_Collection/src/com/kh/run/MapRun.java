package com.kh.run;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.kh.model.Student;

public class MapRun {
	// Map : key-value 구조로 데이터 관리
	//		- key 값은 중복 x, value 값 중복 가능
	public static void main(String[] args) {
		// 선언 및 생성
		Map<String, Student> map = new HashMap<>();
		// 데이터 추가 : put(키값, 밸류값)
		map.put("apple", new Student("apple", 32, 42.2));
		map.put("bananan", new Student("bananan", 22, 33.2));
		map.put("melon", new Student("melon", 43, 35.4));
		// 데이터 조회 : get(키값) : 밸류값
		Student s = map.get("apple");
		// 조회 성공 시 데이터 출력, 실패 시 "해당 데이터가 없습니다" 출력
		if (s != null) {System.out.println(s);}
		else {System.out.println("해당 데이터가 없습니다.");}
		// * entrySet 사용하여 조회 => 전체 순회
		for (Map.Entry<String, Student> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
}